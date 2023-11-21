package tn.esprit.foyerferesbenaissa.services.etudiant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerferesbenaissa.dao.repositories.EtudiantRepository;
@Service
@AllArgsConstructor

public class EtudiantService implements IEtudiantService {
    EtudiantRepository etudiantRepository;

}
