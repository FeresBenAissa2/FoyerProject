package tn.esprit.foyerferesbenaissa.services.bloc;


import tn.esprit.foyerferesbenaissa.dao.entites.Bloc;

import java.util.List;

public interface IBlocService {
    // crud
    Bloc addBloc(Bloc bloc);

    List<Bloc> addAllBlocs(List<Bloc> blocs);

    Bloc updateBloc(Bloc bloc);

    List<Bloc> updateAllBlocs(List<Bloc> blocs);

    List<Bloc> findAllBlocs();

    Bloc findById(long id);

    void deleteBloc(Bloc bloc);
    void deleteBlocById(long id);
}
