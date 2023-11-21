package tn.esprit.foyerferesbenaissa.dao.entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {
    @Id
    private String idReservation;
    private LocalDate anneeUniversaire;
    private boolean estValide;
    @ManyToMany
    List<Etudiant> etudiants;

}
