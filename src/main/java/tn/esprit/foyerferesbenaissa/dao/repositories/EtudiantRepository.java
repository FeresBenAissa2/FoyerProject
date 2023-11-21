package tn.esprit.foyerferesbenaissa.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerferesbenaissa.dao.entites.Chambre;

public interface EtudiantRepository extends JpaRepository<Chambre,Long> {
}
