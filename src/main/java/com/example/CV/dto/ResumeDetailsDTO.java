package com.example.CV.dto;

import com.example.CV.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeDetailsDTO {
    private Resume resume;
    private PersonalInformation personalInformation;
    private List<Study> studies;
    private List<PersonalSkill> personalSkills;
    private List<WorkExperience> workExperiences;
    private List<AdditionalInformation> additionalInformation;
    private List<Annex> annexes;
}
