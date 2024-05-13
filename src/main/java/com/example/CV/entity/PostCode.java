package com.example.CV.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Postcodes")
public class PostCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PostcodeID")
    private Long id;

    @Column(name = "Postcode", nullable = false)
    private String postcode;

    @ManyToOne
    @JoinColumn(name = "CityID")
    private City city;
}