package com.example.CV.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Studies")
public class Study {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudyID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "SchoolID")
    private School school;

    @ManyToOne
    @JoinColumn(name = "FieldID")
    private FieldOfStudy fieldOfStudy;

    @ManyToOne
    @JoinColumn(name = "DiplomaID")
    private TypeOfDiploma typeOfDiploma;

    @ManyToOne
    @JoinColumn(name = "ResumeID")
    private Resume resume;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "StartDate", nullable = false)
    private LocalDate startDate;

    @Column(name = "EndDate", nullable = false)
    private LocalDate endDate;
}
