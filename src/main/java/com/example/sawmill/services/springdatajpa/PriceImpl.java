package com.example.sawmill.services.springdatajpa;

import com.example.sawmill.model.Price;
import com.example.sawmill.repositories.PriceRepository;
import com.example.sawmill.services.PriceService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PriceImpl implements PriceService {

    private final PriceRepository priceRepository;

    public PriceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public Set<Price> findAll() {
        Set<Price> prices = new HashSet<>();
        priceRepository.findAll().forEach(prices::add);
        return prices;
    }

    @Override
    public Price findById(Long aLong) {
        return priceRepository.findById(aLong).orElse(null);
    }

    @Override
    public Price save(Price object) {
        return priceRepository.save(object);
    }

    @Override
    public void delete(Price object) {
        priceRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        priceRepository.deleteById(aLong);
    }
}
