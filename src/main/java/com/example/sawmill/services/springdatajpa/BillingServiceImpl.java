package com.example.sawmill.services.springdatajpa;

import com.example.sawmill.model.Billing;
import com.example.sawmill.repositories.BillingRepository;
import com.example.sawmill.services.BillingService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BillingServiceImpl implements BillingService {

    private final BillingRepository billingRepository;

    public BillingServiceImpl(BillingRepository billingRepository) {
        this.billingRepository = billingRepository;
    }

    @Override
    public Set<Billing> findAll() {
        Set<Billing> billings = new HashSet<>();
        billingRepository.findAll().forEach(billings::add);
        return billings;
    }

    @Override
    public Billing findById(Long aLong) {
        return billingRepository.findById(aLong).orElse(null);
    }

    @Override
    public Billing save(Billing object) {
        return billingRepository.save(object);
    }

    @Override
    public void delete(Billing object) {
        billingRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        billingRepository.deleteById(aLong);
    }
}
