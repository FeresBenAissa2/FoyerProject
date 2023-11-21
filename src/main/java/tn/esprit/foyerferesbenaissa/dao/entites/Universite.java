package tn.esprit.foyerferesbenaissa.dao.entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idUniversite;
    @NonNull
     String nomUniversite;
    @NonNull

     String address;
    // universite c'est le parent de foyer
    @OneToOne
    Foyer foyer;

}
