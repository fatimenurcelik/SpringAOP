package com.celik.springAOP.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celik.springAOP.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
