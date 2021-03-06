package com.academia.desafiocapgemini;

import com.academia.desafiocapgemini.questao01.Escada;
import com.academia.desafiocapgemini.questao02.VerificadorDeSenha;
import com.academia.desafiocapgemini.questao03.AnagramaPares;
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
	public void run(String... args) {
		executarQuestao01(10);
		executarQuestao02("KAR4a%pio");
		executarQuestao03("ovo");
	}

	public static void executarQuestao01(int qtdDegraus){
		Escada escada = new Escada(qtdDegraus);

		String[] resultado = escada.montarEscada();
		Arrays.stream(resultado).forEach(System.out::println);
	}


	public static void executarQuestao02(String senha){
		VerificadorDeSenha verificador = new VerificadorDeSenha(senha);

		System.out.println(verificador.resultado());
	}


	public static void executarQuestao03(String senha){
		AnagramaPares anagrama = new AnagramaPares();
		System.out.println(anagrama.capturarAnagramas(senha));
	}


}
