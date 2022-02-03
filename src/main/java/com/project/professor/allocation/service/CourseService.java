package com.project.professor.allocation.service;

import com.project.professor.allocation.entity.Course;
import com.project.professor.allocation.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course findById(Long id) {
        if (id != null) {
            Optional<Course> professorOptional = courseRepository.findById(id);
            Course professor = professorOptional.orElse(null);
            return professor;
        } else {
            return null;
        }
    }

    public List<Course> findAll() {
        List<Course> professors = courseRepository.findAll();
        return professors;
    }

    public Course create(Course professor) {
        professor.setId(null);
        Course professorNew = courseRepository.save(professor);
        return professorNew;
    }

    public Course update(Course professor) {
        Long id = professor.getId();

        if (id != null && courseRepository.existsById(id)) {
            Course professorNew = courseRepository.save(professor);
            return professorNew;
        } else {
            return null;
        }
    }

    public void deleteById(Long id) {
        if (id != null && courseRepository.existsById(id)) {
            courseRepository.deleteById(id);
        }
    }

    public void deleteAll() {
        courseRepository.deleteAll();
    }
}
