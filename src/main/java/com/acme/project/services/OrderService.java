package com.acme.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.project.entities.Order;
import com.acme.project.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> fildAll() {
		return repository.findAll();
	}
	
	public Order findById(Long Id) {
		Optional<Order> obj = repository.findById(Id);
		return obj.get();
	}
}
