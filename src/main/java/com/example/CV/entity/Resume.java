package com.example.CV.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Resumes")
public class Resume {

    // Default constructor
    public Resume() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ResumeID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "PersonalInfoID")
    private PersonalInformation personalInformation;

}
