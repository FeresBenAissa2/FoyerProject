package tn.esprit.foyerferesbenaissa.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerferesbenaissa.dao.entites.Bloc;
import tn.esprit.foyerferesbenaissa.dao.entites.Etudiant;
import tn.esprit.foyerferesbenaissa.services.bloc.IBlocService;
import tn.esprit.foyerferesbenaissa.services.etudiant.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantRestControler {
    IEtudiantService iEtudiantService;
    // objet ou list => @RequestBody
    // parametre int, float => @RequestParam ou @PathVariable
    @GetMapping("getAll")
    public List<Etudiant> getAll(){
        return iEtudiantService.findAllEtudiants();
    }
    @GetMapping("getById/{id}")
    public Etudiant getById(@PathVariable long id){
        return iEtudiantService.findById(id);
    }
    @PostMapping("addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant ){
        return iEtudiantService.addEtudiant(etudiant);
    }
    @PostMapping("addAllEtudiants")
    public  List<Etudiant> addBloc(@RequestBody  List<Etudiant> etudiants ){
        return iEtudiantService.addAllEtudiants(etudiants);
    }
}
