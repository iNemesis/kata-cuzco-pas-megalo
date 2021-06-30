package com.company.infrastructure;

import com.company.domain.chambre.Chambre;
import com.company.domain.reservation.Reservation;
import com.company.usecase.reservation.ReservationPort;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservationAdapter implements ReservationPort {

    List<Reservation> reservations = new ArrayList<>();

    @Override
    public Reservation reserverChambre(LocalDate jourAReserver, Chambre Chambre) throws Exception {
        var reservation = Reservation.creer(jourAReserver, Chambre);
        reservations.add(reservation);
        return reservation;
    }
}

 /*
    class ReservationsPourUneChambreEtUneFourchetteDeTemps {
        Chambre chambre;
        List<Reservation> reservations;

        public estReservable() {
            return true;
        }
    }
 */
