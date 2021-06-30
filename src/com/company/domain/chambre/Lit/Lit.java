package com.company.domain.chambre.Lit;

import java.util.Objects;

public class Lit {
    final TypeDeLit typeDeLit;
    final int capacité;

    private Lit(TypeDeLit typeDeLit, int capacité) {
        this.typeDeLit = typeDeLit;
        this.capacité = capacité;
    }

    public static Lit kingSizeLit() {
        return new Lit(TypeDeLit.KING_SIZE, 2);
    }

    public static Lit queenSizeLit() {
        return new Lit(TypeDeLit.QUEEN_SIZE, 2);
    }

    public static Lit singleSizeLit() {
        return new Lit(TypeDeLit.SINGLE, 1);
    }

    public int getCapacité() {
        return capacité;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lit lit = (Lit) o;
        return capacité == lit.capacité && typeDeLit == lit.typeDeLit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeDeLit, capacité);
    }

    @Override
    public String toString() {
        return "Lit{" +
                "typeDeLit=" + typeDeLit +
                ", capacité=" + capacité +
                '}';
    }
}