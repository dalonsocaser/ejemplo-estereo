package es.caser.spring.cds;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses=CdPlayer.class)
public class CDPlayerConfig {

}
