package tn.esprit.foyerferesbenaissa.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerferesbenaissa.dao.entites.Bloc;
import tn.esprit.foyerferesbenaissa.dao.entites.Foyer;
import tn.esprit.foyerferesbenaissa.dao.entites.TypeChambre;

import java.util.List;

public interface FoyerRepository extends JpaRepository<Foyer, Long> {
    Foyer findFoyerByNomFoyer(String nom);

    // select * from Foyer where capaciteFoyer >
    List<Foyer> findFoyerByCapaciteFoyerGreaterThan(long capaciteFoyer);

    // select * from Foyer where capaciteFoyer <>>
    List<Foyer> findFoyerByCapaciteFoyerLessThan(long capaciteFoyer);

    // select * from Foyer where capaciteFoyer < and capaciteFoyer >
    List<Foyer> findFoyerByCapaciteFoyerBetween(long minCapaciteFoyer, long maxCapaciteFoyer);

    // affihcer le foyer de l'univiste dont son nom est passe en parametre
    // select * from foyer f Join Universite u on <condition de jointure > where <condition >
    Foyer findByUniversiteNomUniversite(String nom);
    // afficeher la liste des foyers qui comportent des chambres  de meme type
    // que le type passe en parametre

    List<Foyer> findFoyerByBlocsChambresTypeC(TypeChambre typeC);

    //1- Recherche des foyers d'un bloc spécifique
    List<Foyer> findByBlocsNomBloc(String nomBloc);

    // 2- Recherche du foyer par son idFoyer pour un bloc donné
    Foyer findByIdAndBlocsNomBloc(Long id, String nomBloc);

    // 3- Recherche des foyers d'un bloc ayant une capacité spécifique
    List<Foyer> findByBlocsNomBlocAndCapaciteFoyer(String nomBloc, long capaciteFoyer);

    // 4- Recherche du foyer d'un bloc spécifique dans une université donnée
    Foyer findByBlocsNomBlocAndUniversiteNomUniversite(String nomBloc, String nomUniversite);

}
