package com.example.CV.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;
import lombok.ToString;


@Data
@AllArgsConstructor
@Entity
@Table(name = "Annexes")
@ToString(exclude = "resume")

public class Annex {
    public Annex() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AnnexID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ResumeID")
    private Resume resume;

    @Column(name = "AnnexName", nullable = false)
    private String annexName;

    @Column(name = "FilePath", nullable = false)
    private String filePath;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;
}
