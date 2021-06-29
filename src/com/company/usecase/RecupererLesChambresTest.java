package com.company.usecase;

import com.company.domain.Chambre;
import com.company.domain.Lit.Lit;
import com.company.domain.SalleDeBainType;
import com.company.infrastructure.ChambreAdapter;
import com.company.infrastructure.ChambreAdapterMock;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecupererLesChambresTest {
    ChambrePort chambrePort = new ChambreAdapterMock();
    RecupererLesChambres récupérerLesChambres = new RecupererLesChambres(chambrePort);

    @org.junit.jupiter.api.Test
    void quandRécupéreLesChambres_alorsRetourneToutesLesChambres() {
        // Given
        var chambre1 = new Chambre(List.of(Lit.kingSizeLit()), true, true, true, SalleDeBainType.PRIVATE, "101", "1");
        var chambre2 = new Chambre(List.of(Lit.queenSizeLit(), Lit.queenSizeLit()), true, true, true, SalleDeBainType.PRIVATE, "102", "1");
        List<Chambre> chambresAttendues = List.of(chambre1, chambre2);

        // When
        List<Chambre> chambresRécupérées = récupérerLesChambres.exécuter();

        // Then
        assertArrayEquals(chambresRécupérées.toArray(), chambresAttendues.toArray());
    }
}
