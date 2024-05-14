package com.example.CV.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Postes")
public class Poste {
    public Poste(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PosteID")
    private Long id;

    @Column(name = "PosteName", nullable = false)
    private String posteName;
}
