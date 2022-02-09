package com.project.professor.allocation.controller;

import com.project.professor.allocation.service.CourseService;

public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
}
