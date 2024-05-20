package com.example.CV.dto;

import lombok.Data;

@Data
public class LanguageProficiencyDTO {
    private Long id;
    private ResumeDTO resume;
    private LanguageDTO language;
    private LanguageLevelDTO understandingListening;
    private LanguageLevelDTO understandingReading;
    private LanguageLevelDTO speakingInteraction;
    private LanguageLevelDTO speakingProduction;
    private LanguageLevelDTO writingProduction;
}

