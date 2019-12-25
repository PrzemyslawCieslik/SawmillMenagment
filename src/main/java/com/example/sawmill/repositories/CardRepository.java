package com.example.sawmill.repositories;

import com.example.sawmill.model.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Long> {
}
