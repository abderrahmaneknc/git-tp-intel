package com.isi.msscolarite.Repositories;

import com.isi.msscolarite.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRep extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findByIdFormation(Long idf);
}
