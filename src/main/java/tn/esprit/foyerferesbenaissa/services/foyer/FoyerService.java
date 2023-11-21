package tn.esprit.foyerferesbenaissa.services.foyer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerferesbenaissa.dao.repositories.FoyerRepository;

@Service
@AllArgsConstructor
// pour injecter un bean dans un autre bean
// @ setter ,@Allarsconstructor ,@Autowired ,@Injected
// kbal kol attribue nhotou 3liha autowired
public class FoyerService implements IFoyerService{
    FoyerRepository foyerRepository;
}
