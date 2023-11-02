package br.com.highlevel.screenmatch;

import br.com.highlevel.screenmatch.model.DadosSeries;
import br.com.highlevel.screenmatch.service.ConsumoApi;
import br.com.highlevel.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) {
		var chamada = new ConsumoApi();
		var json = chamada.obterDados("https://www.omdbapi.com/?t=breaking+bad&apikey=2e610cf4");
		ConverteDados conversor = new ConverteDados();
		DadosSeries dados = conversor.obterDados(json, DadosSeries.class);
		System.out.println(dados);
	}
}
