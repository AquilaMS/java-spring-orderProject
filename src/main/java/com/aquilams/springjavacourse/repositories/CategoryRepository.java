package com.aquilams.springjavacourse.repositories;

import com.aquilams.springjavacourse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
