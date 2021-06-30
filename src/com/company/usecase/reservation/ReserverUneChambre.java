package com.company.usecase.reservation;

import com.company.domain.reservation.Reservation;
import com.company.usecase.recherche.ChambrePort;

import java.time.LocalDate;

public class ReserverUneChambre {
    ReservationPort reservationPort;
    ChambrePort chambrePort;

    public ReserverUneChambre(ReservationPort reservationPort, ChambrePort chambrePort) {
        this.reservationPort = reservationPort;
        this.chambrePort = chambrePort;
    }

    public Reservation exécuter(LocalDate jourAReserver, String numéroDeChambre) throws Exception {
        var chambreARéserver = chambrePort.récupérerChambreParNuméro(numéroDeChambre);
        boolean estChambreDéjàRéservée = reservationPort.estReservationExistePourCetteDateEtCetteChambre(jourAReserver,numéroDeChambre);
        Reservation reservation = Reservation.creer(jourAReserver, chambreARéserver, estChambreDéjàRéservée);

        return reservationPort.sauvegarderReservation(reservation);
    }
}
