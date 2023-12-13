package tn.esprit.foyerferesbenaissa.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerferesbenaissa.dao.entites.Chambre;
import tn.esprit.foyerferesbenaissa.dao.entites.Etudiant;

import java.time.LocalDate;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    // select * from Etudiant where cin = parametre
    Etudiant findByCin(long cin);

    // select * from Etudiant where nomEt like
    List<Etudiant> findByNomEtLike(String nom);
    List<Etudiant> findByNomEtContaining(String nom);
    List<Etudiant> findByNomEtContains(String nom);


    Etudiant findByNomAndPrenom(String nom, String prenom);

    Etudiant findByCinAndNomE(long cin, String nomE);

    List<Etudiant> findByNaissanceAfter(LocalDate date);

    List<Etudiant> findByEcole(String ecole);

    List<Etudiant> findByReservations_Id(Long reservationId);

    List<Etudiant> findByReservations_Annee(int annee);

    List<Etudiant> findByEcoleAndNaissanceAfter(String ecole, LocalDate date);

    List<Etudiant> findByReservations_AnneeOrderByNaissance(int annee);


}
