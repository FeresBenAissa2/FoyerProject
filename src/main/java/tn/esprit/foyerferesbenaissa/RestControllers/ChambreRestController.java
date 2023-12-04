package tn.esprit.foyerferesbenaissa.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerferesbenaissa.dao.entites.Bloc;
import tn.esprit.foyerferesbenaissa.dao.entites.Chambre;
import tn.esprit.foyerferesbenaissa.services.bloc.IBlocService;
import tn.esprit.foyerferesbenaissa.services.chambre.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ChambreRestController {
    IChambreService iChambreService;
    // objet ou list => @RequestBody
    // parametre int, float => @RequestParam ou @PathVariable
    @GetMapping("getAll")
    public List<Chambre> getAll(){
        return iChambreService.findAllChambres();
    }
    @GetMapping("getById/{id}")
    public Chambre getById(@PathVariable long id){
        return iChambreService.findById(id);
    }
    @PostMapping("addBloc")
    public Chambre addChambre(@RequestBody Chambre chambre ){
        return iChambreService.addChambre(chambre);
    }
    @PostMapping("addAllChambres")
    public  List<Chambre> addChambres(@RequestBody  List<Chambre> chambres ){
        return iChambreService.addAllChambres(chambres);
    }
}
