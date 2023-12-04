package tn.esprit.foyerferesbenaissa.services.bloc;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerferesbenaissa.dao.entites.Bloc;
import tn.esprit.foyerferesbenaissa.dao.repositories.BlocRepository;

import java.util.List;

@Service
// declarer ili hiya bean spring
// springIOC @Compoenent @Repository @Service @RestController @Controller
@AllArgsConstructor
public class BlocService implements IBlocService {
    // tnajem tal9a injtect wela autowired => walaw duplicated
    BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> addAllBlocs(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> updateAllBlocs(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public List<Bloc> findAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findById(long id) {
        // type Optional <Type> : retour de nul
        // resourdre le probleme : .get() ou .orElse(...)
        // .get()
        // 1 - id exist = return result
        // 2 - id does not exist = return empty object
        // .orElse(.....)
        // 1 - id exist = return result
        // 2 - id does not exist = return object defined in orElse method | orElse(Object defined to return )
        //  return blocRepository.findById(id).get();
        return blocRepository.findById(id).orElse(Bloc.builder().idBloc(0).nomBloc("bizzare").build()); // lezem na3mel construit te3 objet mich mawjoud fil db
    }

    @Override
    public void deleteBloc(Bloc bloc) {
        blocRepository.delete(bloc);
    }

    @Override
    public void deleteBlocById(long id) {
        blocRepository.deleteById(id);
    }
}
