package com.example.sawmill.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long LocationId;

    public String street;
    public String city;
    public String state;
    public String postcode;

    @OneToOne
    public Company company;
}
