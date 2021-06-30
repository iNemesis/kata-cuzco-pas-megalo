package com.company.usecase.recherche;

import com.company.domain.chambre.Chambre;

import java.util.List;

public class RechercherChambresParCapacite {
    ChambrePort chambrePort;

    public RechercherChambresParCapacite(ChambrePort chambrePort) {
        this.chambrePort = chambrePort;
    }

    public List<Chambre> exécuter(int capacitéMinimum) {
        return chambrePort.listerChambreAvecCapacitéMinimum(capacitéMinimum);
    }
}
