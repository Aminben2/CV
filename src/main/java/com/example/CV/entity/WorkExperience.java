package com.example.CV.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Entity
@Table(name = "WorkExperiences")
public class WorkExperience {
    public WorkExperience(){
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ExperienceID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "EnterpriseID")
    private Enterprise enterprise;

    @ManyToOne
    @JoinColumn(name = "PosteID")
    private Sector sector;

    @ManyToOne
    @JoinColumn(name = "ResumeID")
    private Resume resume;

    @Column(name = "StartDate", nullable = false)
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;
}

