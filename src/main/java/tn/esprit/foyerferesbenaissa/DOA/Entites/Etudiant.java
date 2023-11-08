package tn.esprit.foyerferesbenaissa.DOA.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity

public class Etudiant {
    @Id
    private String idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin ;
    private String ecole ;
    private LocalDate dateNaissance;
}
