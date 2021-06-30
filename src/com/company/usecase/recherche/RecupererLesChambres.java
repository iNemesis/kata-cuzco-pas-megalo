package com.company.usecase.recherche;

import com.company.domain.chambre.Chambre;

import java.util.List;

public class RecupererLesChambres {

    private ChambrePort chambrePort;

    public RecupererLesChambres(ChambrePort chambrePort) {
        this.chambrePort = chambrePort;
    }

    public List<Chambre> exécuter() {
        return chambrePort.listerChambres();
    }
}
