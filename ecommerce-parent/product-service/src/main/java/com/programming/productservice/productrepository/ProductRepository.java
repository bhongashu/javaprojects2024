package com.programming.productservice.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programming.productservice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
