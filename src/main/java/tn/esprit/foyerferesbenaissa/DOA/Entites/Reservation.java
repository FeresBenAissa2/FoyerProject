package tn.esprit.foyerferesbenaissa.DOA.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Reservation {
    @Id
    private String idReservation;
    private LocalDate anneeUniversaire;
    private boolean estValide;
}
