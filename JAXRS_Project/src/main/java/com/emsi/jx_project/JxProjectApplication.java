package com.emsi.jx_project;

import com.emsi.jx_project.enumeration.Typecompte;
import com.emsi.jx_project.repository.CompteRepository;
import com.emsi.jx_project.entity.Compte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class JxProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxProjectApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository) {
        return args -> {
            compteRepository.save(new Compte(null,Math.random()*9000,new Date(), Typecompte.COURANT));
            compteRepository.save(new Compte(null,Math.random()*9000,new Date(), Typecompte.EPARGNE));
            compteRepository.save(new Compte(null,Math.random()*9000,new Date(), Typecompte.EPARGNE));
            compteRepository.findAll().forEach(compte -> {
                System.out.println(compte);
            });

        };
    }

}
