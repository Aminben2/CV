package com.example.CV.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AddressID")
    private Long id;

    @Column(name = "HouseNumber", nullable = false)
    private String houseNumber;

    @ManyToOne
    @JoinColumn(name = "StreetID")
    private Street street;
}