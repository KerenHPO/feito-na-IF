package edu.ifmt.cobrancaifmt2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.LocaleResolver;
@SpringBootApplication
@EnableJpaRepositories("edu.ifmt.cobrancaifmt2.repository")
@EntityScan("edu.ifmt.cobrancaifmt2.model")
public class Cobrancaifmt2Application {

	public static void main(String[] args) {
		SpringApplication.run(Cobrancaifmt2Application.class, args);
	}
	
	@Bean
	public LocaleResolver localeResolver() {
	
	return new LocaleResolver(new Locale("pt", "BR"));
	}

}
