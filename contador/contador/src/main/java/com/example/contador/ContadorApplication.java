package com.example.contador;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication
		implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor limite para a contagem");

		var valor = scanner.nextInt();

		Contar contar = new Contar(valor);
		contar.aplicacao();


		Tarefa tarefa = new Tarefa("programar", true, "Danrley"); // instanciando um objeto
		// System.out.println(tarefa); // instanciando a criacao do file

		ObjectMapper mapper = new ObjectMapper();// jackson
		mapper.writeValue(new File("tarefa.json"), tarefa); // primeiro o file, depois o object

		System.out.println("Salvo na serialização");

		// erro aqui em baixo

		Tarefa tarefaLida = mapper.readValue(new File("tarefa.json"), Tarefa.class);
		System.out.println("Tarefa lida");
		System.out.println(tarefaLida);
	}
}
