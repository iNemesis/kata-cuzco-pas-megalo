package com.company.infrastructure;

import com.company.domain.Chambre;
import com.company.domain.Lit.Lit;
import com.company.domain.SalleDeBainType;
import com.company.usecase.ChambrePort;

import java.util.List;

public class ChambreAdapterMock implements ChambrePort {

    @Override
    public List<Chambre> getAllChambers() {
        return List.of(
                new Chambre(List.of(Lit.kingSizeLit()), true, true, true, SalleDeBainType.PRIVATE, "101", "1"),
                new Chambre(List.of(Lit.queenSizeLit(), Lit.queenSizeLit()), true, true, true, SalleDeBainType.PRIVATE, "102", "1")
        );
    }
}
