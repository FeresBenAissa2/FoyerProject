package tn.esprit.foyerferesbenaissa.dao.entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long idFoyer;
    String nomFoyer;
    long capaciteFoyer;
    // foyer => child de universite -> contient mappped
    @OneToOne(mappedBy = "foyer")
    Universite universite;
    // foyer => child ! one to many
    @OneToMany(mappedBy = "foyer")
    List<Bloc> blocs;
}
