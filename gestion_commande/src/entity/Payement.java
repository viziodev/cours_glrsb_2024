package entity;

public class Payement {

    private int id;
    private String numero;
    private double montantVerser;
    public double getMontantVerser() {
        return montantVerser;
    }

    public void setMontantVerser(double montantVerser) {
        this.montantVerser = montantVerser;
    }

    private Facture facture;

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
        return "Payement [id=" + id + ", numero=" + numero + ", montantVerser=" + montantVerser + ", facture=" + facture
                + "]";
    }
}
