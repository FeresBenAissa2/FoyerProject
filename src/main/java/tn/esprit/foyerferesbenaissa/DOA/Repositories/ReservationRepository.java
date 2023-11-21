package tn.esprit.foyerferesbenaissa.DOA.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerferesbenaissa.DOA.Entites.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
