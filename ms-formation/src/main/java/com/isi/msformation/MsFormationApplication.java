package com.isi.msformation;

import com.isi.msformation.Entities.Formation;
import com.isi.msformation.Repositories.FormationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsFormationApplication implements CommandLineRunner {
    @Autowired
    FormationRep formationRep;

    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Formation F1 = formationRep.save(new Formation(null,"java",20));
        Formation F2 = formationRep.save(new Formation(null,"SpringBoot",20));
        Formation F3 = formationRep.save(new Formation(null,"C++",20));

    }
}