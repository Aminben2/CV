package com.example.CV.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "SKILLS")
public class Skill {
    public Skill (){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SkillID")
    private Long id;

    @Column(name = "SkillName", nullable = false)
    private String skillName;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;
}