package com.isi.msformation.Repositories;

import com.isi.msformation.Entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface FormationRep extends JpaRepository<Formation, Long> {
}
