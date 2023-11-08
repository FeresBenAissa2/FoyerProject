package tn.esprit.foyerferesbenaissa.DOA.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    private String idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private LocalDate dateNaissance;
}
