package com.example.sawmill.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Data
public class ExpirationDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expirationDateId;

    public String date;
    public Integer timezoneType;
    public String timezone;

    @OneToOne
    public Card card;

}
