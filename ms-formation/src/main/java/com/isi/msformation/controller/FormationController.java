package com.isi.msformation.controller;

import com.isi.msformation.Entities.Formation;
import com.isi.msformation.Repositories.FormationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RefreshScope
public class FormationController {

    @Autowired
    private FormationRep formationRep;

    @GetMapping("/formations/{id}")
    public Formation getFormation(@PathVariable Long id) {
        return formationRep.findById(id).get();
    }

    @Value("${mes-config.email}")
    private String email;

    @GetMapping("email")
    public String getEmail(){
        return email;
    }


}
