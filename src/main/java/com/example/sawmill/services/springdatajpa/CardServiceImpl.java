package com.example.sawmill.services.springdatajpa;

import com.example.sawmill.model.Card;
import com.example.sawmill.repositories.CardRepository;
import com.example.sawmill.services.CardService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public Set<Card> findAll() {
        Set<Card> cards = new HashSet<>();
        cardRepository.findAll().forEach(cards::add);
        return cards;
    }

    @Override
    public Card findById(Long aLong) {
        return cardRepository.findById(aLong).orElse(null);
    }

    @Override
    public Card save(Card object) {
        return cardRepository.save(object);
    }

    @Override
    public void delete(Card object) {
        cardRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        cardRepository.deleteById(aLong);
    }
}
