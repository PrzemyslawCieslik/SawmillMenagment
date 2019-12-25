package com.example.sawmill.repositories;

import com.example.sawmill.model.Billing;
import org.springframework.data.repository.CrudRepository;

public interface BillingRepository extends CrudRepository<Billing, Long> {
}
