package com.company.domain.reservation;

import com.company.domain.chambre.Chambre;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Reservation {
    UUID id;
    LocalDate date;
    Chambre chambre;

    private Reservation(UUID id, LocalDate date, Chambre chambre) {
        this.id = id;
        this.date = date;
        this.chambre = chambre;
    }

    public static Reservation creer(LocalDate date, Chambre chambre) throws Exception {
        UUID id = UUID.randomUUID();

        if (date.isBefore(LocalDate.now())) {
            throw new Exception("Oh non ! La date ne peut pas être dans le passé.");
        }

        return new Reservation(id, date, chambre);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", chambre=" + chambre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(id, that.id) && Objects.equals(date, that.date) && Objects.equals(chambre, that.chambre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, chambre);
    }
}
