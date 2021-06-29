package com.company.infrastructure;

import com.company.domain.Chambre;
import com.company.domain.Lit.Lit;
import com.company.domain.SalleDeBainType;
import com.company.usecase.ChambrePort;

import java.util.List;

public class ChambreAdapter implements ChambrePort {
    @Override
    public List<Chambre> getAllChambers() {
        return List.of(
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
    }
}
