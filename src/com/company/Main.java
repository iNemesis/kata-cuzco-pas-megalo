package com.company;

import com.company.application.ChambreApplication;
import com.company.application.ReservationApplication;
import com.company.infrastructure.ChambreAdapter;
import com.company.infrastructure.ReservationAdapter;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        var chambreAdapter = new ChambreAdapter();
        var reservationAdapter = new ReservationAdapter();

        var chambreApplication = new ChambreApplication(chambreAdapter);
        var reservationApplication = new ReservationApplication(reservationAdapter, chambreAdapter);

        chambreApplication.printTableauDeChambres();
        chambreApplication.printTableauDeChambresAvecCapacitéMinimum(5);

        var demain = LocalDate.now().plusDays(1);
        var numéroDeChambreAReserver = "101";
        reservationApplication.reserverUneChambre(demain, numéroDeChambreAReserver);
        reservationApplication.reserverUneChambre(demain, numéroDeChambreAReserver);
    }
}
