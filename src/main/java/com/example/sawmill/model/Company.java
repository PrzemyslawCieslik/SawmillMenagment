package com.example.sawmill.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    private String companyName;
    private String companyTaxCode;

    @OneToOne
    public Location location;
}
