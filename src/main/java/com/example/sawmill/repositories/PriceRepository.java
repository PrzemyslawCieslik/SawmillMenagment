package com.example.sawmill.repositories;

import com.example.sawmill.model.Price;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<Price, Long> {
}
