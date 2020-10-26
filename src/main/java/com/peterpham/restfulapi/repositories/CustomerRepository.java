package com.peterpham.restfulapi.repositories;


import com.peterpham.restfulapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findbyName(String name);
}
