package com.isi.msscolarite.Repositories;

import com.isi.msscolarite.Entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtablissementRep extends JpaRepository<Etablissement, Long> {
}
