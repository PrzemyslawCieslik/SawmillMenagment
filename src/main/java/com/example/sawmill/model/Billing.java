package com.example.sawmill.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Billing {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long billingId;

        @ManyToOne
        public Card card;

}
