package br.com.marquesrh.rhcontroller.modules.companies.controllers;


import br.com.marquesrh.rhcontroller.modules.companies.entities.CompanyEntity;
import br.com.marquesrh.rhcontroller.modules.companies.services.CreateCompanyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CreateCompanyService createCompanyService;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody CompanyEntity company) {
        try {
            var resultado = this.createCompanyService.execute(company);
            return ResponseEntity.ok(resultado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
