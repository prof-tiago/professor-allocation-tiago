package com.project.professor.allocation.repository;

import com.project.professor.allocation.entity.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class DepartmentRepositoryTest {

    @Autowired
    public DepartmentRepository departmentRepository;

    @Test
    public void findAll()
    {
        List<Department> departments = departmentRepository.findAll();
        System.out.println(departments);
    }

    @Test
    public void findById()
    {
        Long id = 1L;
        Optional<Department> departmentOptional = departmentRepository.findById(id);
        System.out.println(departmentOptional.orElse(null));
    }

    @Test
    public void create()
    {
        Department department = new Department();
        department.setId(null);
        department.setName("Francês");

        Department departmentNew = departmentRepository.save(department);

        System.out.println(departmentNew);
    }

    @Test
    public void update()
    {
        Department department = new Department();
        department.setId(4L);
        department.setName("Filosofia");

        Department departmentNew = departmentRepository.save(department);

        System.out.println(departmentNew);
    }

    @Test
    public void deleteById()
    {
        Long id = 1L;

        departmentRepository.deleteById(id);
    }

    @Test
    public void deleteAll()
    {
        departmentRepository.deleteAllInBatch();
    }

    @Test
    public void findByNameContaining()
    {
        List<Department> departs = departmentRepository.findByNameContaining("ia");
        System.out.println(departs);
    }
}