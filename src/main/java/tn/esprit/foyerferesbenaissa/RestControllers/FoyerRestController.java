package tn.esprit.foyerferesbenaissa.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerferesbenaissa.dao.entites.Foyer;
import tn.esprit.foyerferesbenaissa.services.foyer.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor

public class FoyerRestController {
    IFoyerService iFoyerService;
    // objet ou list => @RequestBody
    // parametre int, float => @RequestParam ou @PathVariable
    @GetMapping("getAll")
    public List<Foyer> getAll(){
        return iFoyerService.findAllFoyers();
    }
    @GetMapping("getById/{id}")
    public Foyer getById(@PathVariable long id){
        return iFoyerService.findById(id);
    }
    @PostMapping("addFoyer")
    public Foyer addFoyer(@RequestBody Foyer Foyer ){
        return iFoyerService.addFoyer(Foyer);
    }
    @PostMapping("addAllFoyers")
    public  List<Foyer> addBloc(@RequestBody  List<Foyer> Foyers ){
        return iFoyerService.addAllFoyers(Foyers);
    }
}
