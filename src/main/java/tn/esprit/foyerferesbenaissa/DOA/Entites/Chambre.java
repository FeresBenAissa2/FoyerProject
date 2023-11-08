package tn.esprit.foyerferesbenaissa.DOA.Entites;

import jakarta.persistence.*;

@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre ;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)

    private TypeChambre typeC;
}
