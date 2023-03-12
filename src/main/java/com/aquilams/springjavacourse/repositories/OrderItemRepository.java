package com.aquilams.springjavacourse.repositories;

import com.aquilams.springjavacourse.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
