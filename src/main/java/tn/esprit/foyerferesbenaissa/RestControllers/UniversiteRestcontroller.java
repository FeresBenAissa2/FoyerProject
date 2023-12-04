package tn.esprit.foyerferesbenaissa.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.foyerferesbenaissa.dao.entites.Universite;
import tn.esprit.foyerferesbenaissa.services.universite.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteRestcontroller {
    IUniversiteService iUniversiteService;
    // objet ou list => @RequestBody
    // parametre int, float => @RequestParam ou @PathVariable
    @GetMapping("getAll")
    public List<Universite> getAll(){
        return iUniversiteService.findAllUniversites();
    }
    @GetMapping("getById/{id}")
    public Universite getById(@PathVariable long id){
        return iUniversiteService.findById(id);
    }
    @PostMapping("addUniversite")
    public Universite addUniversite(@RequestBody Universite universite ){
        return iUniversiteService.addUniversite(universite);
    }
    @PostMapping("addAllUniversites")
    public  List<Universite> addUniversites(@RequestBody  List<Universite> universites ){
        return iUniversiteService.addAllUniversites(universites);
    }
}
