package tn.esprit.foyerferesbenaissa.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerferesbenaissa.dao.entites.Universite;

import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    //    - Afficher la liste des universités qui ont des étudiants dont leurs noms contiennet
    //    la chaine de caractère en paramètre et leurs dates de naissance entre deux dates passées en paramètre
    List<Universite> findUniversitiesByStudentNameAndBirthdateRange();

}
