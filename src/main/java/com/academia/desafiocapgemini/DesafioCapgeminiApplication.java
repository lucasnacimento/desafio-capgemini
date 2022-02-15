package com.academia.desafiocapgemini;

import com.academia.desafiocapgemini.questao01.Escada;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DesafioCapgeminiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioCapgeminiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		executarQuestao01(10);
	}

	public static void executarQuestao01(int qtdDegraus){
		Escada escada = new Escada(qtdDegraus);

		String[] resultado = escada.montar();
		Arrays.stream(resultado).forEach(System.out::println);
	}
}
