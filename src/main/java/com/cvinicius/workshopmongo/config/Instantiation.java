package com.cvinicius.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.cvinicius.workshopmongo.domain.User;
import com.cvinicius.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User carlos = new User(null, "Carlos", "carlos.vinicius@ccee.org.br");
		User vini = new User(null, "Vinicius", "c.viniciussantos@outlook.com");
		
		userRepository.saveAll(Arrays.asList(carlos, vini));
	}
}
