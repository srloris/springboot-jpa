package com.acme.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.project.entities.OrderItem;
import com.acme.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
