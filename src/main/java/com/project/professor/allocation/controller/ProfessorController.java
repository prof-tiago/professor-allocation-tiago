package com.project.professor.allocation.controller;

import com.project.professor.allocation.service.ProfessorService;

public class ProfessorController {

    private ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }
}
