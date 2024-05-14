package com.example.CV.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Countries")
public class Country {
    // Default constructor
    public Country() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CountryID")
    private Long id;

    @Column(name = "CountryName", nullable = false)
    private String countryName;

    @Column(name = "NationalityName", nullable = true)
    private String nationalityName;

}