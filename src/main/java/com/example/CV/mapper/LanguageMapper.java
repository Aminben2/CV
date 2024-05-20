package com.example.CV.mapper;

import com.example.CV.dto.LanguageDTO;
import com.example.CV.entity.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LanguageMapper {

    public LanguageDTO languageToDTO(Language language) {
        if (language == null) return null;
        LanguageDTO languageDTO = new LanguageDTO();
        languageDTO.setId(language.getId());
        languageDTO.setLanguageCode(language.getLanguageCode());
        return languageDTO;
    }
}
