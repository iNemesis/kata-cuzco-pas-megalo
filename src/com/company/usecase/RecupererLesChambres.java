package com.company.usecase;

import com.company.domain.Chambre;

import java.util.List;

public class RecupererLesChambres {

    private ChambrePort chambrePort;

    public RecupererLesChambres(ChambrePort chambrePort) {
        this.chambrePort = chambrePort;
    }

    public List<Chambre> exécuter() {
        return chambrePort.getAllChambers();
    }
}
