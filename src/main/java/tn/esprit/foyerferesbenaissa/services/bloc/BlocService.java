package tn.esprit.foyerferesbenaissa.services.bloc;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerferesbenaissa.dao.repositories.BlocRepository;

@Service
// declarer ili hiya bean spring
// springIOC @Compoenent @Repository @Service @RestController @Controller
@AllArgsConstructor
public class BlocService implements IBlocService {
    // tnajem tal9a injtect wela autowired => walaw duplicated
    BlocRepository blocRepository;
}
