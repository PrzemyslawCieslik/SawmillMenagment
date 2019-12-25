package com.example.sawmill.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Data
public class Price {

    @Id
    @GeneratedValue
    private Long priceId;

    private int priceOfProduct;

    @ManyToMany(mappedBy = "Product")
    public Set<Product> product;
}
