package io.pivotal.cf.workshop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class WorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopApplication.class, args);
	}

	@Bean
	CommandLineRunner loadDatabase(MessageRepository messageRepository) {
		return args -> {
			log.debug("loading database..");
			messageRepository.deleteAll();
			messageRepository.save(new Message("Hello JPA world!"));
			log.info("Fortune Repo record count: {}", messageRepository.count());
			messageRepository.findAll().forEach(x -> log.debug(x.toString()));
		};

	}

}
