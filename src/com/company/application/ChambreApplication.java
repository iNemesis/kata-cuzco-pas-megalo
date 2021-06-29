package com.company.application;

import com.company.usecase.ChambrePort;
import com.company.usecase.RecupererLesChambres;

public class ChambreApplication {

    ChambrePort chambrePort;

    public ChambreApplication(ChambrePort chambrePort) {
        this.chambrePort = chambrePort;
    }

    public void printTableauDeChambres() {
        var récupérerLesChambres = new RecupererLesChambres(chambrePort);



        System.out.println(récupérerLesChambres.exécuter());
    }
}
