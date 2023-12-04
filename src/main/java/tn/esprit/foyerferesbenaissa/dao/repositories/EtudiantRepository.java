package tn.esprit.foyerferesbenaissa.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerferesbenaissa.dao.entites.Chambre;
import tn.esprit.foyerferesbenaissa.dao.entites.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
