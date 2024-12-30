package com.acme.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.acme.project.entities.User;
import com.acme.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Lorenzo Bastos Nunez", "lorenzobnunez@gmail.com", "(11) 94147-6403", "1234");
		User u2 = new User(null, "Nathaly Ellem Pereira Brizzio", "ellem.brizzio@gmail.com", "(11) 94564-0360", "1234");
		User u3 = new User(null, "Zoe Brizzio Nunez", "zoebnunez@gmail.com", "(11) 99999-0000", "1234");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
	}
		
}
