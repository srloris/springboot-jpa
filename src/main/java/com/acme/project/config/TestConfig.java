package com.acme.project.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.acme.project.entities.Category;
import com.acme.project.entities.Order;
import com.acme.project.entities.Product;
import com.acme.project.entities.User;
import com.acme.project.entities.enums.OrderStatus;
import com.acme.project.repositories.CategoryRepository;
import com.acme.project.repositories.OrderRepository;
import com.acme.project.repositories.ProductRepository;
import com.acme.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		
		User u1 = new User(null, "Lorenzo Bastos Nunez", "lorenzobnunez@gmail.com", "(11) 94147-6403", "1234");
		User u2 = new User(null, "Nathaly Ellem Pereira Brizzio", "ellem.brizzio@gmail.com", "(11) 94564-0360", "1234");
		User u3 = new User(null, "Zoe Brizzio Nunez", "zoebnunez@gmail.com", "(11) 99999-0000", "1234");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
		
}
