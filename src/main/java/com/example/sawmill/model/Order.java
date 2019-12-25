package com.example.sawmill.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @OneToOne
    public Company company;

    @OneToOne
    public Billing billing;

    @OneToOne
    public Product product;
}
