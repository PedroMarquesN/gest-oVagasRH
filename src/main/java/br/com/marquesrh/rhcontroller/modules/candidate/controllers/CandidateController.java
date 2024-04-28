package br.com.marquesrh.rhcontroller.modules.candidate.controllers;

import br.com.marquesrh.rhcontroller.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@Valid @RequestBody CandidateEntity candidate) {
        System.out.println("Candidate created");
        System.out.println(candidate.getEmail());
    }
}
