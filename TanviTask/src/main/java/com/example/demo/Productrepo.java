package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Productrepo extends JpaRepository<Product, Integer> {
	
	@Query("select p from Product p where p.productid=?1")
	public Product findbyid(int id);

}
