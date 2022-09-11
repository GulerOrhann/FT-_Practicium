package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	 @Query("SELECT p FROM Product p WHERE p.expirationDate < CURRENT_DATE")
	    List<Product> findAllByExpirationDateIsBefore();

	 @Query("SELECT p FROM Product p WHERE p.expirationDate > CURRENT_DATE OR p.expirationDate IS NULL")
	    List<Product> findAllByExpirationDateIsAfterOrIsNull();


}
