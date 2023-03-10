package com.aquilams.springjavacourse.repositories;

import com.aquilams.springjavacourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
