package com.example.sawmill.services.springdatajpa;

import com.example.sawmill.model.ExpirationDate;
import com.example.sawmill.repositories.ExpirationDateRepository;
import com.example.sawmill.services.ExpirationDateService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ExpirationDataServiceImpl implements ExpirationDateService {

    private final ExpirationDateRepository expirationDateRepository;

    public ExpirationDataServiceImpl(ExpirationDateRepository expirationDateRepository) {
        this.expirationDateRepository = expirationDateRepository;
    }


    @Override
    public Set<ExpirationDate> findAll() {
        Set<ExpirationDate> expirationDates = new HashSet<>();
        expirationDateRepository.findAll().forEach(expirationDates::add);
        return expirationDates;
    }

    @Override
    public ExpirationDate findById(Long aLong) {
        return expirationDateRepository.findById(aLong).orElse(null);
    }

    @Override
    public ExpirationDate save(ExpirationDate object) {
        return expirationDateRepository.save(object);
    }

    @Override
    public void delete(ExpirationDate object) {
        expirationDateRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        expirationDateRepository.deleteById(aLong);
    }
}
