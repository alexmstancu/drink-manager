package com.idp.drinkmanagerrest;

import com.idp.drinkmanagerrest.model.Drink;
import com.idp.drinkmanagerrest.repository.DrinkRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@Configuration
////@ComponentScan(basePackages = {"com.idp.drinkmanagerrest.repository"})
//@ComponentScan(basePackages = {"com.idp.drinkmanagerrest"})
//@

@SpringBootApplication
public class DrinkManagerRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrinkManagerRestApplication.class, args);
	}

	Drink wine = new Drink("Purcari", 1990, "Romania", "red", "demisec",
			12, "wine", "strong", "grapes", "Moldova");

	Drink beer = new Drink("Timisoreana", 2017, "Romania", "blonda", "amarui",
			6, "wine", "strong", "hamei", "Bucuresti");
	@Bean
	ApplicationRunner init(DrinkRepository repo) {
		return args -> {
			repo.save(wine);
			repo.save(beer);
			repo.findAll().forEach(System.out::println);
		};
	}

}
