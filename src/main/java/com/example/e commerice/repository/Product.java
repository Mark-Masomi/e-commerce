package com.example.e.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Product extends JpaRepository<Product, Long> {

    List<Product> findByNameContainingIgroneCase(String name);


}
