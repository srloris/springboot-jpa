package com.acme.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
