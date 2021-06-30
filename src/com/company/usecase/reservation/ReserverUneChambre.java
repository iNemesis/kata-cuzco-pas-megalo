package com.company.usecase.reservation;

import com.company.domain.chambre.Chambre;
import com.company.domain.reservation.Reservation;
import com.company.usecase.recherche.ChambrePort;

import java.time.LocalDate;
import java.util.Optional;

public class ReserverUneChambre {
    ReservationPort reservationPort;
    ChambrePort chambrePort;

    public ReserverUneChambre(ReservationPort reservationPort, ChambrePort chambrePort) {
        this.reservationPort = reservationPort;
        this.chambrePort = chambrePort;
    }

    public Reservation exécuter(LocalDate jourAReserver, String numéroDeChambre) throws Exception {
        var chambreARéserver = chambrePort.récupérerChambreParNuméro(numéroDeChambre);

        return reservationPort.reserverChambre(jourAReserver, chambreARéserver);
    }
}
