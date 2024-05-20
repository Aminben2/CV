package com.example.CV.mapper;

import com.example.CV.dto.LanguageLevelDTO;
import com.example.CV.entity.LanguageProficiency;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LanguageLevelMapper {
    public LanguageLevelDTO languageLevelToDTO(LanguageProficiency.LanguageLevel languageLevel) {
        if (languageLevel == null) return null;
        LanguageLevelDTO languageLevelDTO = new LanguageLevelDTO();
        languageLevelDTO.setLevel(languageLevel.name());
        return languageLevelDTO;
    }
}
