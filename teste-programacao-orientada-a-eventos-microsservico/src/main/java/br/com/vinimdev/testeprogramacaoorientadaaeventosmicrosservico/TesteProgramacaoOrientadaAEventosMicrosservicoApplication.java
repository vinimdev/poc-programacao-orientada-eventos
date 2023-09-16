package br.com.vinimdev.testeprogramacaoorientadaaeventosmicrosservico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class TesteProgramacaoOrientadaAEventosMicrosservicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteProgramacaoOrientadaAEventosMicrosservicoApplication.class, args);
	}

}
