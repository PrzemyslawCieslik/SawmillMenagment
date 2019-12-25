package com.example.sawmill.services.springdatajpa;

import com.example.sawmill.model.Order;
import com.example.sawmill.repositories.OrderRepository;
import com.example.sawmill.services.OrderService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Set<Order> findAll() {
        Set<Order> orders = new HashSet<>();
        orderRepository.findAll().forEach(orders::add);
        return orders;
    }

    @Override
    public Order findById(Long aLong) {
        return orderRepository.findById(aLong).orElse(null);
    }

    @Override
    public Order save(Order object) {
        return orderRepository.save(object);
    }

    @Override
    public void delete(Order object) {
        orderRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        orderRepository.deleteById(aLong);
    }
}
