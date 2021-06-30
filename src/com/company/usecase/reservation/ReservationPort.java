package com.company.usecase.reservation;

import com.company.domain.reservation.Reservation;

import java.time.LocalDate;

public interface ReservationPort {
    Reservation sauvegarderReservation(Reservation réservation) throws Exception;

    boolean estReservationExistePourCetteDateEtCetteChambre(LocalDate jourAReserver, String numéroDeChambre);
}
