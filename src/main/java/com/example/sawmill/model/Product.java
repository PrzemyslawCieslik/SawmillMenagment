package com.example.sawmill.model;

import com.example.sawmill.enums.Grade;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;
    private String productQuantity;
    private int width;
    private int length;
    private int height;

    public Grade grade;

    @OneToOne
    public Order order;

    @ManyToMany(cascade = CascadeType.ALL)
    public  Set<Price> price;

}
