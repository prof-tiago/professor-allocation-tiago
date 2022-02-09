package com.project.professor.allocation.controller;

import com.project.professor.allocation.service.AllocationService;

public class AllocationController {

    private AllocationService allocationService;

    public AllocationController(AllocationService allocationService) {
        this.allocationService = allocationService;
    }
}
