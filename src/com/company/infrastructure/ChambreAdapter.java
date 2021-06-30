package com.company.infrastructure;

import com.company.domain.chambre.Chambre;
import com.company.domain.chambre.Lit.Lit;
import com.company.domain.chambre.SalleDeBainType;
import com.company.usecase.recherche.ChambrePort;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ChambreAdapter implements ChambrePort {

    List<Chambre> chambres = List.of(
            new Chambre(List.of(Lit.kingSizeLit()), true, true, true, SalleDeBainType.PRIVATE, "101", "1"),
            new Chambre(List.of(Lit.queenSizeLit(), Lit.queenSizeLit()), true, true, true, SalleDeBainType.PRIVATE, "102", "1"),
            new Chambre(List.of(Lit.singleSizeLit(),Lit.singleSizeLit(), Lit.singleSizeLit()),true,true,true,SalleDeBainType.PRIVATE,"103","1"),
            new Chambre(List.of(Lit.kingSizeLit()), true, true, false, SalleDeBainType.PRIVATE, "201", "2"),
            new Chambre(List.of(Lit.queenSizeLit()), false, true, false, SalleDeBainType.PRIVATE,"202","2" ),
            new Chambre(List.of(Lit.kingSizeLit(), Lit.singleSizeLit(), Lit.singleSizeLit(), Lit.singleSizeLit()), true, true, false, SalleDeBainType.PRIVATE, "203", "2"),
            new Chambre(List.of(Lit.singleSizeLit()), false, true, false, SalleDeBainType.SHARED, "204", "2"),
            new Chambre(List.of(Lit.singleSizeLit(),Lit.singleSizeLit()),true,true,false, SalleDeBainType.SHARED,"205","2"),
            new Chambre(List.of(Lit.queenSizeLit()), true, false, false, SalleDeBainType.PRIVATE, "301", "3"),
            new Chambre(List.of(Lit.singleSizeLit(), Lit.singleSizeLit()), true, false, false, SalleDeBainType.PRIVATE, "302", "3"),
            new Chambre(List.of(Lit.singleSizeLit(), Lit.singleSizeLit(), Lit.singleSizeLit()),true,false,false,SalleDeBainType.SHARED,"303","3"),
            new Chambre(List.of(Lit.singleSizeLit(), Lit.singleSizeLit()), false, false, false, SalleDeBainType.SHARED, "304", "3")
    );

    @Override
    public List<Chambre> listerChambres() {
        return this.chambres;
    }

    @Override
    public List<Chambre> listerChambreAvecCapacitéMinimum(int capacitéMinimum) {
        return this.chambres
                .stream()
                .filter((chambre) -> chambre.getCapacité() >= capacitéMinimum)
                .collect(Collectors.toList());
    }

    @Override
    public Chambre récupérerChambreParNuméro(String numéroDeChambre) throws Exception {
        return this.chambres
                .stream()
                .filter((chambre) -> chambre.getNuméroDeChambre().equals(numéroDeChambre))
                .findFirst()
                .orElseThrow(() -> new Exception("Aucune chambre n'a été trouvée pour ce numéro de chambre."));
    }
}
