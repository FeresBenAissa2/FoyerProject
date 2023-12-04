package tn.esprit.foyerferesbenaissa.services.reservation;

import tn.esprit.foyerferesbenaissa.dao.entites.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);

    List<Reservation> addAllReservations(List<Reservation> reservations);

    Reservation updateReservation(Reservation reservation);

    List<Reservation> updateAllReservations(List<Reservation> reservations);

    List<Reservation> findAllReservations();

    Reservation findById(String id);

    void deleteReservation(Reservation reservation);
    void deleteReservationById(String id);
}
