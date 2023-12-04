package tn.esprit.foyerferesbenaissa.services.foyer;

import tn.esprit.foyerferesbenaissa.dao.entites.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);

    List<Foyer> addAllFoyers(List<Foyer> foyers);

    Foyer updateFoyer(Foyer foyer);

    List<Foyer> updateAllFoyers(List<Foyer> foyers);

    List<Foyer> findAllFoyers();

    Foyer findById(long id);

    void deleteFoyer(Foyer foyer);
    void deleteFoyerById(long id);
}
