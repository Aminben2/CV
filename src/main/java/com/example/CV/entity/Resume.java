package com.example.CV.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Resumes")
@ToString(exclude = {"studies", "personalSkills", "workExperiences", "additionalInformation", "annexes"})

public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ResumeID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "PersonalInfoID")
    private PersonalInformation personalInformation;

    @OneToMany(mappedBy = "resume")
    private List<Study> studies;

    @OneToMany(mappedBy = "resume")
    private List<PersonalSkill> personalSkills;

    @OneToMany(mappedBy = "resume")
    private List<WorkExperience> workExperiences;

    @OneToMany(mappedBy = "resume")
    private List<AdditionalInformation> additionalInformation;

    @OneToMany(mappedBy = "resume")
    private List<Annex> annexes;

    // Explicit getters

    public Long getId() {
        return id;
    }

    public List<Study> getStudies() {
        return studies;
    }

    public List<PersonalSkill> getPersonalSkills() {
        return personalSkills;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public List<AdditionalInformation> getAdditionalInformation() {
        return additionalInformation;
    }

    public List<Annex> getAnnexes() {
        return annexes;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }
}
