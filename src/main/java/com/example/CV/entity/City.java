package com.example.CV.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CityID")
    private Long id;

    @Column(name = "CityName", nullable = false)
    private String cityName;

    @ManyToOne
    @JoinColumn(name = "CountryID")
    private Country country;
}