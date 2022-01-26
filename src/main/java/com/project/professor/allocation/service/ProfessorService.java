package com.project.professor.allocation.service;

import com.project.professor.allocation.entity.Professor;
import com.project.professor.allocation.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfessorService {

    private ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }
    public Professor findById(Long id)
    {
        Optional<Professor> ProfessorOptional = professorRepository.findById(id);
        Professor Professor = ProfessorOptional.orElse(null);
        return Professor;
    }
}
