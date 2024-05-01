package br.com.marquesrh.rhcontroller.modules.companies.services;

import br.com.marquesrh.rhcontroller.modules.companies.entities.CompanyEntity;
import br.com.marquesrh.rhcontroller.modules.companies.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity company) {
        this.companyRepository.findByCnpj(company.getCnpj())
                .ifPresent(c -> {
                    throw new RuntimeException("Empresa já existe");
                });
        return this.companyRepository.save(company);
    }
}
