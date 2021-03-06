package de.vsfexperts.latex.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan(basePackageClasses = Application.class)
public class Application {

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
