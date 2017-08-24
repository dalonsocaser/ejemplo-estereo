package es.caser.spring.cds;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {
	@Bean(name="enriqueIglesiasCd")
	public CdVirgen enriqueIglesiasCd(){
		return new CdVirgen("S�beme la radio", "Enrique Iglesias");
	}
}
