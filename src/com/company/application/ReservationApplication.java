package com.company.application;

import com.company.usecase.recherche.ChambrePort;
import com.company.usecase.reservation.ReservationPort;
import com.company.usecase.reservation.ReserverUneChambre;

import java.time.LocalDate;

public class ReservationApplication {

    ReservationPort reservationPort;
    ChambrePort chambrePort;

    public ReservationApplication(ReservationPort reservationPort, ChambrePort chambrePort) {
        this.reservationPort = reservationPort;
        this.chambrePort = chambrePort;
    }

    public void reserverUneChambre(LocalDate dateDeReservation, String numéroDeChambre) throws Exception {
        var reserverUneChambre = new ReserverUneChambre(reservationPort, chambrePort);
        System.out.println(reserverUneChambre.exécuter(dateDeReservation, numéroDeChambre));
    }
}
