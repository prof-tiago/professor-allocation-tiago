package com.project.professor.allocation.service;

import com.project.professor.allocation.entity.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
public class DepartmentServiceTest {

    @Autowired
    DepartmentService departmentService;

    @Test
    public void findById()
    {
        Department department = departmentService.findById(7L);
        System.out.println(department);
    }
}
