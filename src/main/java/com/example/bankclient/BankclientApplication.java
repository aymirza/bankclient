package com.example.bankclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BankclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankclientApplication.class, args);
	}

}
