package com.example.CV.mapper;

import com.example.CV.dto.ProjectDTO;
import com.example.CV.entity.Project;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProjectMapper {

    public ProjectDTO projectToDTO(Project project) {
        if (project == null) return null;
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setId(project.getId());
        projectDTO.setName(project.getName());
        projectDTO.setDescription(project.getDescription());
        return projectDTO;
    }
}
