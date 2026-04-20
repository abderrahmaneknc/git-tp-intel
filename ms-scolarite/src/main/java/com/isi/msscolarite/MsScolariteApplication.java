package com.isi.msscolarite;

import com.isi.msscolarite.Entities.Etablissement;
import com.isi.msscolarite.Entities.Etudiant;
import com.isi.msscolarite.Repositories.EtablissementRep;
import com.isi.msscolarite.Repositories.EtudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients
public class MsScolariteApplication implements CommandLineRunner {
    @Autowired
    EtablissementRep etablissementRep;
    @Autowired
    EtudiantRep etudiantRep;
    public static void main(String[] args) {
        SpringApplication.run(MsScolariteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Etablissement e1 = etablissementRep.save(new Etablissement(null,"esi-sba",null));
        Etablissement e2 = etablissementRep.save(new Etablissement(null,"udl-sba",null));
        etudiantRep.save(new Etudiant(null,"ahmed", Date.valueOf("2002-01-10"),
                null,null,e2,1L,null));
        etudiantRep.save(new Etudiant(null,"Meriem", Date.valueOf("2005-08-10"),
                null,null,e1,1L,null));
        etudiantRep.save(new Etudiant(null,"ali", Date.valueOf("2002-01-15"),
                null,null,e2,2L,null));
        etudiantRep.save(new Etudiant(null,"fatima", Date.valueOf("2002-05-10"),
                null,null,e1,3L,null));

    }
}
