package com.company.usecase.reservation;

import com.company.domain.chambre.Chambre;
import com.company.domain.reservation.Reservation;

import java.time.LocalDate;

public interface ReservationPort {
    Reservation reserverChambre(LocalDate jourAReserver, Chambre Chambre) throws Exception;
}
