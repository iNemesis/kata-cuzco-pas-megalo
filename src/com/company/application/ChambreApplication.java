package com.company.application;

import com.company.usecase.recherche.ChambrePort;
import com.company.usecase.recherche.RechercherChambresParCapacite;
import com.company.usecase.recherche.RecupererLesChambres;

public class ChambreApplication {

    ChambrePort chambrePort;

    public ChambreApplication(ChambrePort chambrePort) {
        this.chambrePort = chambrePort;
    }

    public void printTableauDeChambres() {
        var récupérerLesChambres = new RecupererLesChambres(chambrePort);

        System.out.println(récupérerLesChambres.exécuter());
    }

    public void printTableauDeChambresAvecCapacitéMinimum(int capacitéMinimum) {
        var rechercherChambresParCapacité = new RechercherChambresParCapacite(chambrePort);

        System.out.println(rechercherChambresParCapacité.exécuter(capacitéMinimum));
    }
}
