package entity;

import java.time.LocalDate;

public class Payement {
    private static int nbrePayement;
    private int id;
    private String numero;
    private double montantVerser;
    LocalDate datePayement;
    public double getMontantVerser() {
        return montantVerser;
    }

    public void setMontantVerser(double montantVerser) {
        this.montantVerser = montantVerser;
    }

    private Facture facture;

    public Payement() {
        nbrePayement++;
        id=nbrePayement;
        int size= String.valueOf(id).length();
        numero= "PAY"+"0".repeat(4-size<0?0:4-size)+id;
        datePayement=LocalDate.now();
    }

    public Payement(int id, String numero, double montantVerser) {
        this.id = id;
        this.numero = numero;
        this.montantVerser = montantVerser;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Payement [id=" + id + ", numero=" + numero + ", montantVerser=" + montantVerser + "]";
    }
}
