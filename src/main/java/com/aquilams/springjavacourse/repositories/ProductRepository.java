package com.aquilams.springjavacourse.repositories;

import com.aquilams.springjavacourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
