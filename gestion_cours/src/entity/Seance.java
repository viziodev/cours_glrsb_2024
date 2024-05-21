package entity;

import java.time.LocalDate;
import java.time.LocalTime;

import entity.enums.Statut;

public class Seance extends AbstractEntity {
    private LocalDate date;
    private LocalTime heureDb;
    private LocalTime heureFin;
    private Statut statut;
    private Cours cours;
    
    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Seance(LocalDate date, LocalTime heureDb, LocalTime heureFin, Statut statut) {
        this.date = date;
        this.heureDb = heureDb;
        this.heureFin = heureFin;
        this.statut = statut;
    }

    public Seance(LocalDate date, LocalTime heureDb, LocalTime heureFin) {
        this.date = date;
        this.heureDb = heureDb;
        this.heureFin = heureFin;
    }

    public Seance() {
        nbre++;
        this.id = nbre;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeureDb() {
        return heureDb;
    }

    public void setHeureDb(LocalTime heureDb) {
        this.heureDb = heureDb;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }

    @Override
    public String toString() {
        return "Seance [date=" + date + ", heureDb=" + heureDb + ", heureFin=" + heureFin + "]";
    }
}
