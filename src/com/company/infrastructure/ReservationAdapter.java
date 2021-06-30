package com.company.infrastructure;

import com.company.domain.reservation.Reservation;
import com.company.usecase.reservation.ReservationPort;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservationAdapter implements ReservationPort {

    List<Reservation> reservations = new ArrayList<>();

    @Override
    public Reservation sauvegarderReservation(Reservation réservation) {
        reservations.add(réservation);
        return réservation;
    }

    @Override
    public boolean estReservationExistePourCetteDateEtCetteChambre(LocalDate jourAReserver, String numéroDeChambre) {
        return reservations
                .stream()
                .anyMatch((reservation) ->
                        reservation.getChambre().getNuméroDeChambre().equals(numéroDeChambre) &&
                        reservation.getDate().equals(jourAReserver));
    }

}
