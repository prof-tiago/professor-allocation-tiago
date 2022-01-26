package com.project.professor.allocation.repository;

import com.project.professor.allocation.entity.Allocation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class AllocationRepositoryTest {

    @Autowired
    public AllocationRepository allocationRepository;

    @Test
    public void findByProfessorId()
    {
        Long professorId = 1L;
        List<Allocation> allocations = allocationRepository.findByProfessorId(professorId);
        System.out.println(allocations);
    }
}