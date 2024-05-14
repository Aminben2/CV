package com.example.CV.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Streets")
public class Street {
    public Street (){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StreetID")
    private Long id;

    @Column(name = "StreetName", nullable = false)
    private String streetName;

    @ManyToOne
    @JoinColumn(name = "PostcodeID")
    private PostCode postcode;
}

