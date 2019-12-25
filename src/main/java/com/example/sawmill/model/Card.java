package com.example.sawmill.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;

    public String type;
    public String number;

    @OneToOne
    public ExpirationDate expirationDate;

    public String iban;
    public String swift;

    @OneToMany
    public Set<Billing> billing;


}
