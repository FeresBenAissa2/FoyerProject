package tn.esprit.foyerferesbenaissa.services.etudiant;

import tn.esprit.foyerferesbenaissa.dao.entites.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);

    List<Etudiant> addAllEtudiants(List<Etudiant> etudiants);

    Etudiant updateEtudiant(Etudiant etudiant);

    List<Etudiant> updateAllEtudiants(List<Etudiant> etudiants);

    List<Etudiant> findAllEtudiants();

    Etudiant findById(long id);

    void deleteEtudiant(Etudiant etudiant);
    void deleteEtudiantById(long id);
}
