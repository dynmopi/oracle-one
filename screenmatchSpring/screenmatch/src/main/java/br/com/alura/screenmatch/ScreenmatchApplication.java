package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScreenmatchApplication.class, args);
	}


	@Override // A interface CommandLineRunner representa uma tarefa a ser executada após a inicialização do Spring Boot
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi
				.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=e3f4c7fd");

		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

		json = consumoApi
				.obterDados("https://omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=e3f4c7fd");
		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		System.out.println(dadosEpisodio);

		List<DadosTemporada> temporada = new ArrayList<>();

		for (int i = 1; i <= dados.totalTemporadas(); i++) {
			json = consumoApi
					.obterDados("https://omdbapi.com/?t=gilmore+girls&season=" + i + "&episode=2&apikey=e3f4c7fd");

			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporada.add(dadosTemporada);
		}

		temporada.forEach(System.out::println);
	}
}