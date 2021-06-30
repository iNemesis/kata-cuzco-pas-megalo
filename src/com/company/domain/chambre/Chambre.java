package com.company.domain.chambre;

import com.company.domain.chambre.Lit.Lit;

import java.util.List;
import java.util.Objects;

public class Chambre {
    List<Lit> lits;
    boolean climatiseur;
    boolean wifi;
    boolean fauteuilRoulant;
    SalleDeBainType salleDeBainType;
    String numéroDeChambre;
    String étage;

    public Chambre(List<Lit> lits, boolean climatiseur, boolean wifi, boolean fauteuilRoulant, SalleDeBainType salleDeBainType, String numéroDeChambre, String étage) {
        this.lits = lits;
        this.climatiseur = climatiseur;
        this.wifi = wifi;
        this.fauteuilRoulant = fauteuilRoulant;
        this.salleDeBainType = salleDeBainType;
        this.numéroDeChambre = numéroDeChambre;
        this.étage = étage;
    }

    public int getCapacité() {
        return lits.stream()
                .map(Lit::getCapacité)
                .reduce(0, Integer::sum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chambre chambre = (Chambre) o;
        return climatiseur == chambre.climatiseur && wifi == chambre.wifi && fauteuilRoulant == chambre.fauteuilRoulant && Objects.equals(lits, chambre.lits) && salleDeBainType == chambre.salleDeBainType && Objects.equals(numéroDeChambre, chambre.numéroDeChambre) && Objects.equals(étage, chambre.étage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lits, climatiseur, wifi, fauteuilRoulant, salleDeBainType, numéroDeChambre, étage);
    }

    @Override
    public String toString() {
        return "Chambre{" +
                "lits=" + lits +
                ", climatiseur=" + climatiseur +
                ", wifi=" + wifi +
                ", fauteuilRoulant=" + fauteuilRoulant +
                ", salleDeBainType=" + salleDeBainType +
                ", numéroDeChambre='" + numéroDeChambre + '\'' +
                ", étage='" + étage + '\'' +
                ", capacité='" + getCapacité() + '\'' +
                '}' + '\n';
    }

    public String getNuméroDeChambre() {
        return numéroDeChambre;
    }
}
