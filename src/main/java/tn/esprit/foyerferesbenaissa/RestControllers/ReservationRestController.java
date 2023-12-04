package tn.esprit.foyerferesbenaissa.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerferesbenaissa.dao.entites.Reservation;
import tn.esprit.foyerferesbenaissa.services.reservation.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationRestController {
    IReservationService iReservationService;
    @GetMapping("getAll")
    public List<Reservation> getAll(){
        return iReservationService.findAllReservations();
    }
    @GetMapping("getById/{id}")
    public Reservation getById(@PathVariable String id){
        return iReservationService.findById(id);
    }
    @PostMapping("addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation ){
        return iReservationService.addReservation(reservation);
    }
    @PostMapping("addAllReservations")
    public  List<Reservation> addBloc(@RequestBody  List<Reservation> reservations ){
        return iReservationService.addAllReservations(reservations);
    }
}
