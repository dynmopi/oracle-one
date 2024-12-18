package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();


    private final String ENDERECO = "https://omdbapi.com/?t=";
    private final String API_KEY = "&apikey=e3f4c7fd";



    public void exibeMenu(){
        System.out.println("Digite o nome da série para a busca: ");
        var nomeSerie = leitura.nextLine();

        var json = consumo
                .obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);

        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporada> temporada = new ArrayList<>();
        for (int i = 1; i <= dados.totalTemporadas(); i++) {

            json = consumo
                    .obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);

            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporada.add(dadosTemporada);
        }

        temporada.forEach(System.out::println);

//        for (int i = 0; i < dados.totalTemporadas(); i++) {
//            List<DadosEpisodio> episodiosTemporada = temporada.get(i).episodio();
//            for (int j = 0; j < episodiosTemporada.size(); j++) {
//                System.out.println(episodiosTemporada.get(j).titulo());
//            }
//        }
        temporada.forEach(t -> t.episodio().forEach(e -> System.out.println(e.titulo())));
        temporada.forEach(System.out::println);

        List<DadosEpisodio> dadosEpisodios = temporada.stream()
                .flatMap(t -> t.episodio().stream())
                .collect(Collectors.toList());

        System.out.println("\nTop 5 episódios");
        dadosEpisodios.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A")) // equalsIgnoreCase() é um metodo que ignora o caseSensitive.
                // nesse trecho, o parâmetro e está sendo negado caso a avaliacao tenha "N/A" na api
                // o .filter irá filtrar apenas o que NÃO (!) tiverem o "N/A"
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao)
                        .reversed()) // inverte do maior para o menos
                .limit(5)
                .forEach(System.out::println);

        List<Episodio> episodio = temporada.stream()
                .flatMap(t -> t.episodio().stream()
                        .map(d -> new Episodio(t.numero(), d)))
                .collect(Collectors.toList());

        episodio.forEach(System.out::println);

        System.out.println("A partir de que ano você deseja ver os episódios? ");
        var ano = leitura.nextInt();
        leitura.nextLine(); // limpa o buffer

        LocalDate dataBusca = LocalDate.of(ano, 1, 1); // para fazer a varredura pelo ano inteiro, começando do dia 1 de janeiro

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // olha no .format(formatador)

        episodio.stream()
                .filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca)) // por exemplo, se a data de lancamento for null - problema de api - e a data de lancamento coincidir após o ano do filme, então ele executará.
                // dataBusca = 2020 e o dataFilme = 2019 -> isso dará certo
                .forEach(e -> System.out.println(
                        "Temporada:  " + e.getTemporada() +
                                " Episódio: " + e.getTitulo() +
                                " Data lançamento: " + e.getDataLancamento().format(formatador)
                ));


    }
}
