package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.ArrayList;
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
    }
}
