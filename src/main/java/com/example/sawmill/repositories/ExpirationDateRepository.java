package com.example.sawmill.repositories;

import com.example.sawmill.model.ExpirationDate;
import org.springframework.data.repository.CrudRepository;

public interface ExpirationDateRepository extends CrudRepository<ExpirationDate, Long> {
}
