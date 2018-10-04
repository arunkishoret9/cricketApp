package com.cricket.tournament.cricket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CricketApplication implements CommmandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(CricketApplication.class, args);

	}

	@Override
	public void run (String... string) throws Exception{

	}
}
