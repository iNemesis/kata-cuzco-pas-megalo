package com.company.usecase.recherche;

import com.company.domain.chambre.Chambre;

import java.util.List;
import java.util.Optional;

public interface ChambrePort {

    List<Chambre> listerChambres();

    List<Chambre> listerChambreAvecCapacitéMinimum(int capacitéMinimum);

    Chambre récupérerChambreParNuméro(String numéroDeChambre) throws Exception;
}
