package com.example.CV.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "PersonalSkills")
public class PersonalSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PSID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "LanguageID")
    private Language language;

    @ManyToOne
    @JoinColumn(name = "ResumeID")
    private Resume resume;

    @ManyToOne
    @JoinColumn(name = "SkillID")
    private Skill skill;

    @Column(name = "ProficiencyLevel")
    private String proficiencyLevel;
}
