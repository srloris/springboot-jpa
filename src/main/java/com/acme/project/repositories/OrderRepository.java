package com.acme.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
