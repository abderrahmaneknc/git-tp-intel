package com.isi.msscolarite.API;

import com.isi.msscolarite.Entities.Etudiant;
import com.isi.msscolarite.FormationProxy;
import com.isi.msscolarite.Model.Formation;
import com.isi.msscolarite.Repositories.EtudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class APIScolarite {
    @Autowired
    EtudiantRep etudiantRep;
    @Autowired
    FormationProxy formationProxy;
    @GetMapping("/etudiant/{id}")
    public Etudiant getEtudiantAvecFormation(@PathVariable("id")Long ide){
        Etudiant e = etudiantRep.findById(ide).get();
        Formation f = formationProxy.getFormation(e.getIdFormation());
        e.setFormation(f);
        return e;
    }
}

