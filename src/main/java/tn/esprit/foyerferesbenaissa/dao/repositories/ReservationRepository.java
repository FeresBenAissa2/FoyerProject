package tn.esprit.foyerferesbenaissa.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerferesbenaissa.dao.entites.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
