package com.example.CV.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;
import lombok.ToString;

@Data
@AllArgsConstructor
@Entity
@Table(name = "AdditionalInformation")
@ToString(exclude = "resume")
public class AdditionalInformation {
    public AdditionalInformation() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AdditionalInfoID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ResumeID")
    private Resume resume;

    @Column(name = "AdditionalInfoType", nullable = false)
    private String additionalInfoType;

    @Column(name = "AdditionalInfoValue", columnDefinition = "TEXT")
    private String additionalInfoValue;
}
