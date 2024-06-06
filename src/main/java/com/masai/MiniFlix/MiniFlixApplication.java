package com.masai.MiniFlix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MiniFlixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniFlixApplication.class, args);
	}

}
