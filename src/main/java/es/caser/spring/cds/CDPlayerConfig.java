package es.caser.spring.cds;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan
@ImportResource("classpath:META-INF/context.xml")
public class CDPlayerConfig {
	
}
