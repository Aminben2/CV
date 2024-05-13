package com.example.CV.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Languages")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LanguageID")
    private Long id;

    @Column(name = "LanguageName", nullable = false)
    private String languageName;
}

