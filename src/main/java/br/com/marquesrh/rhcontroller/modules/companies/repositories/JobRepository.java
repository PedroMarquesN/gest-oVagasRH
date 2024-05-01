package br.com.marquesrh.rhcontroller.modules.companies.repositories;

import br.com.marquesrh.rhcontroller.modules.companies.entities.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {


    Optional<JobEntity> findById(UUID uuid);
}
