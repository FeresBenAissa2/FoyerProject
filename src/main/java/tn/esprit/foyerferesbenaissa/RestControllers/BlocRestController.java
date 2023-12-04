package tn.esprit.foyerferesbenaissa.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerferesbenaissa.dao.entites.Bloc;
import tn.esprit.foyerferesbenaissa.services.bloc.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {
    IBlocService iBlocService;
    // objet ou list => @RequestBody
    // parametre int, float => @RequestParam ou @PathVariable
    @GetMapping("getAll")
    public List<Bloc> getAll(){
        return iBlocService.findAllBlocs();
    }
    @GetMapping("getById/{id}")
    public Bloc getById(@PathVariable long id){
        return iBlocService.findById(id);
    }
    @PostMapping("addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc ){
        return iBlocService.addBloc(bloc);
    }
    @PostMapping("addAllBlocs")
    public  List<Bloc> addBloc(@RequestBody  List<Bloc> blocs ){
        return iBlocService.addAllBlocs(blocs);
    }

}
