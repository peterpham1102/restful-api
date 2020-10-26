package com.peterpham.restfulapi.repositories;


import com.peterpham.restfulapi.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByName(String name);
}
