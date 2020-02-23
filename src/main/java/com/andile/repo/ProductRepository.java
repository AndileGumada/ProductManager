package com.andile.repo;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.andile.model.Product;

//the purpose of this
public interface ProductRepository extends JpaRepository<Product, Long > {

	
}
