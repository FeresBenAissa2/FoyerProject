package tn.esprit.foyerferesbenaissa.DOA.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerferesbenaissa.DOA.Entites.Chambre;

public interface EtudiantRepository extends JpaRepository<Chambre,Long> {
}
