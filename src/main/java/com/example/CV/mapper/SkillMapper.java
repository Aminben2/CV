package com.example.CV.mapper;

import com.example.CV.dto.SkillDTO;
import com.example.CV.entity.Skill;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SkillMapper {

    public SkillDTO skillToDTO(Skill skill) {
        if (skill == null) return null;

        SkillDTO skillDTO = new SkillDTO();
        skillDTO.setId(skill.getId());
        skillDTO.setDescription(skill.getDescription());

        return skillDTO;
    }

    public List<SkillDTO> skillsToDTO(List<Skill> skills) {
        List<SkillDTO> skillDTOs = new ArrayList<>();
        for (Skill skill : skills) {
            SkillDTO skillDTO = skillToDTO(skill);
            skillDTOs.add(skillDTO);
        }
        return skillDTOs;
    }
}
