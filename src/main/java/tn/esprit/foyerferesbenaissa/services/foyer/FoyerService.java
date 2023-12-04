package tn.esprit.foyerferesbenaissa.services.foyer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerferesbenaissa.dao.entites.Foyer;
import tn.esprit.foyerferesbenaissa.dao.repositories.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
// pour injecter un bean dans un autre bean
// @ setter ,@Allarsconstructor ,@Autowired ,@Injected
// kbal kol attribue nhotou 3liha autowired
public class FoyerService implements IFoyerService {
    FoyerRepository foyerRepository;

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public List<Foyer> addAllFoyers(List<Foyer> foyers) {
        return foyerRepository.saveAll(foyers);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public List<Foyer> updateAllFoyers(List<Foyer> foyers) {
        return foyerRepository.saveAll(foyers);
    }

    @Override
    public List<Foyer> findAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer findById(long id) {
        return foyerRepository.findById(id).get();
    }

    @Override
    public void deleteFoyer(Foyer foyer) {
        foyerRepository.delete(foyer);
    }

    @Override
    public void deleteFoyerById(long id) {
        foyerRepository.deleteById(id);
    }
}
