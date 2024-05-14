package com.example.CV.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "TypesOfDiploma")
public class TypeOfDiploma {
    public TypeOfDiploma(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DiplomaID")
    private Long id;

    @Column(name = "DiplomaType", nullable = false)
    private String diplomaType;
}