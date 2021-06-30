import com.company.domain.chambre.Chambre;
import com.company.domain.chambre.Lit.Lit;
import com.company.domain.chambre.SalleDeBainType;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChambreTest {

    @org.junit.jupiter.api.Test
    void quandOnFaitGetCapacité_alorsRetourneLaCapacité() {
        // Given
        var lits = List.of(Lit.kingSizeLit(), Lit.singleSizeLit(), Lit.queenSizeLit());
        Chambre chambre = new Chambre(lits, true, true, true, SalleDeBainType.PRIVATE, "15", "99");

        // When
        var capacitéDeLaChambre = chambre.getCapacité();

        // Then
        assertEquals(capacitéDeLaChambre, 5);
    }
}
