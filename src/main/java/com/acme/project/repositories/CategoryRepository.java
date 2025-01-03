package com.acme.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
