package com.example.CV.mapper;

import com.example.CV.dto.LanguageProficiencyDTO;
import com.example.CV.entity.LanguageProficiency;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class LanguageProficiencyMapper {

    private final LanguageMapper languageMapper;
    private final LanguageLevelMapper languageLevelMapper;

    public LanguageProficiencyDTO languageProficiencyToDTO(LanguageProficiency languageProficiency) {
        if (languageProficiency == null) return null;

        LanguageProficiencyDTO languageProficiencyDTO = new LanguageProficiencyDTO();
        languageProficiencyDTO.setId(languageProficiency.getId());
        languageProficiencyDTO.setLanguage(languageMapper.languageToDTO(languageProficiency.getLanguage())); // Assuming you have a method to convert Language entities to LanguageDTOs
        languageProficiencyDTO.setUnderstandingListening(languageLevelMapper.languageLevelToDTO(languageProficiency.getUnderstandingListening()));
        languageProficiencyDTO.setUnderstandingReading(languageLevelMapper.languageLevelToDTO(languageProficiency.getUnderstandingReading()));
        languageProficiencyDTO.setSpeakingInteraction(languageLevelMapper.languageLevelToDTO(languageProficiency.getSpeakingInteraction()));
        languageProficiencyDTO.setSpeakingProduction(languageLevelMapper.languageLevelToDTO(languageProficiency.getSpeakingProduction()));
        languageProficiencyDTO.setWritingProduction(languageLevelMapper.languageLevelToDTO(languageProficiency.getWritingProduction()));

        return languageProficiencyDTO;
    }

    public List<LanguageProficiencyDTO> languageProficienciesToDTO(List<LanguageProficiency> languageProficiencies) {
        List<LanguageProficiencyDTO> languageProficiencyDTOs = new ArrayList<>();
        for (LanguageProficiency languageProficiency : languageProficiencies) {
            LanguageProficiencyDTO languageProficiencyDTO = languageProficiencyToDTO(languageProficiency);
            languageProficiencyDTOs.add(languageProficiencyDTO);
        }
        return languageProficiencyDTOs;
    }
}
