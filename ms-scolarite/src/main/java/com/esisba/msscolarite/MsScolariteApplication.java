package com.esisba.msscolarite;

import com.esisba.msscolarite.entities.Etablissement;
import com.esisba.msscolarite.entities.Etudiant;
import com.esisba.msscolarite.repositories.EtablissementRepository;
import com.esisba.msscolarite.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class MsScolariteApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MsScolariteApplication.class, args);
    }

    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    EtablissementRepository etablissementRepository;
    @Override
    public void run(String... args) throws Exception {
        Etablissement esisba = etablissementRepository.save(new Etablissement(null,"esi-sba",null));
        Etablissement esialger = etablissementRepository.save(new Etablissement(null,"esi-alger",null));

        etudiantRepository.save(new Etudiant(null, "djamel", Date.valueOf("2002-02-03"),"4siw",null,esisba));
        etudiantRepository.save(new Etudiant(null, "farid", Date.valueOf("2000-02-03"),"4iasd",null,esisba));
        etudiantRepository.save(new Etudiant(null, "said", Date.valueOf("1998-02-03"),"2cp",null,esialger));
        etudiantRepository.save(new Etudiant(null, "dahman", Date.valueOf("3000-02-03"),"1cp",null,esialger));

    }
}
