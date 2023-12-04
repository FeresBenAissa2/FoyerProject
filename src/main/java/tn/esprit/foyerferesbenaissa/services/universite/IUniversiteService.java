package tn.esprit.foyerferesbenaissa.services.universite;

import tn.esprit.foyerferesbenaissa.dao.entites.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);

    List<Universite> addAllUniversites(List<Universite> universites);

    Universite updateUniversite(Universite universite);

    List<Universite> updateAllUniversites(List<Universite> universites);

    List<Universite> findAllUniversites();

    Universite findById(long id);

    void deleteUniversite(Universite universite);
    void deleteUniversiteById(long id);
}
