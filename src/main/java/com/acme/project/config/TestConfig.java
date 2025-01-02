package com.acme.project.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.acme.project.entities.Order;
import com.acme.project.entities.User;
import com.acme.project.repositories.OrderRepository;
import com.acme.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Lorenzo Bastos Nunez", "lorenzobnunez@gmail.com", "(11) 94147-6403", "1234");
		User u2 = new User(null, "Nathaly Ellem Pereira Brizzio", "ellem.brizzio@gmail.com", "(11) 94564-0360", "1234");
		User u3 = new User(null, "Zoe Brizzio Nunez", "zoebnunez@gmail.com", "(11) 99999-0000", "1234");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
		
}
