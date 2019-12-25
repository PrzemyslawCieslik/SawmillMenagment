package com.example.sawmill.repositories;

import com.example.sawmill.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
