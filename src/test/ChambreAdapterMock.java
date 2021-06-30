import com.company.domain.chambre.Chambre;
import com.company.domain.chambre.Lit.Lit;
import com.company.domain.chambre.SalleDeBainType;
import com.company.usecase.recherche.ChambrePort;

import java.util.List;
import java.util.Optional;

public class ChambreAdapterMock implements ChambrePort {

    @Override
    public List<Chambre> listerChambres() {
        return List.of(
                new Chambre(List.of(Lit.kingSizeLit()), true, true, true, SalleDeBainType.PRIVATE, "101", "1"),
                new Chambre(List.of(Lit.queenSizeLit(), Lit.queenSizeLit()), true, true, true, SalleDeBainType.PRIVATE, "102", "1")
        );
    }

    @Override
    public List<Chambre> listerChambreAvecCapacitéMinimum(int capacitéMinimum) {
        return null;
    }

    @Override
    public Chambre récupérerChambreParNuméro(String numéroDeChambre) {
        return null;
    }
}
