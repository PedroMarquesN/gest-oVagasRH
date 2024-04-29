package br.com.marquesrh.rhcontroller.modules.candidate.useCases;

import br.com.marquesrh.rhcontroller.modules.candidate.CandidateEntity;
import br.com.marquesrh.rhcontroller.modules.candidate.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreateCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    public CandidateEntity execute(CandidateEntity candidate){
        this.candidateRepository.findByUsernameOrEmail(candidate.getUsername(), candidate.getEmail())
                .ifPresent(c -> {
                    throw new RuntimeException("Usuário já existe");
                });
        return this.candidateRepository.save(candidate);
    }
}
