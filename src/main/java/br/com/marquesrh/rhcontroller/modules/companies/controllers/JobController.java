package br.com.marquesrh.rhcontroller.modules.companies.controllers;

import br.com.marquesrh.rhcontroller.modules.companies.entities.JobEntity;
import br.com.marquesrh.rhcontroller.modules.companies.services.CreateJobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private CreateJobService createJobService;

    @PostMapping("/")
    public JobEntity createJob(@Valid @RequestBody JobEntity job) {
        return this.createJobService.execute(job);
    }


}
