package com.example.CV.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "FieldsOfStudy")
public class FieldOfStudy {
    public FieldOfStudy (){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FieldID")
    private Long id;

    @Column(name = "FieldName", nullable = false)
    private String fieldName;
}
