package tn.esprit.foyerferesbenaissa.services.chambre;

import tn.esprit.foyerferesbenaissa.dao.entites.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);

    List<Chambre> addAllChambres(List<Chambre> chambres);

    Chambre updateChambre(Chambre chambre);

    List<Chambre> updateAllChambres(List<Chambre> chambres);

    List<Chambre> findAllChambres();

    Chambre findById(long id);

    void deleteChambre(Chambre chambre);
    void deleteChambreById(long id);
}
