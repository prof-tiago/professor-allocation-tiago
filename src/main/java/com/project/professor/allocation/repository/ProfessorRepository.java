package com.project.professor.allocation.repository;

import com.project.professor.allocation.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Department, Long> {
}
