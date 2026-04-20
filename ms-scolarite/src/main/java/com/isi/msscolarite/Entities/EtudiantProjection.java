package com.isi.msscolarite.Entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {Etudiant.class}, name = "toformation")
public interface EtudiantProjection {
    @Value("#{target.nom}")
        String getNom();
    @Value("#{target.etablissement.nom}")
    String getEtblissementNom();


}
