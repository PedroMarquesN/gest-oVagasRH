package br.com.marquesrh.rhcontroller.modules.companies.services;

import br.com.marquesrh.rhcontroller.modules.companies.entities.JobEntity;
import br.com.marquesrh.rhcontroller.modules.companies.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateJobService {

    @Autowired
    private JobRepository jobRepository;


    public JobEntity execute(JobEntity job) {

        if (job.getId() != null) {
            this.jobRepository.findById(job.getId())
                    .ifPresent(j -> {
                        throw new RuntimeException("Vaga já existe");
                    });

        }
        return this.jobRepository.save(job);
    }
}
