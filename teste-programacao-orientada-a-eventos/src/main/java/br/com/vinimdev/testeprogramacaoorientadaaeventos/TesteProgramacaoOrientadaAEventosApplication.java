package br.com.vinimdev.testeprogramacaoorientadaaeventos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class TesteProgramacaoOrientadaAEventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteProgramacaoOrientadaAEventosApplication.class, args);
	}

}
