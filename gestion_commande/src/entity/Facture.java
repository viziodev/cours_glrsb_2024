package entity;

public class Facture {
      //Constante
      private  static final int N=10;
      //Attribut
        private int id;
        private String numero;
        private double montant;
        
     //Attribut de Relation 
      //OneToOne
     private Commande commande; 
     public Commande getCommande() {
        return commande;
    }
    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    //OneToMany
      private Payement[] payements=new Payement[N];
      public void addTab(Payement payements) {
        if (taille<N) {
            this.payements[taille] = payements;
            taille++;  
        }
        this.payements[taille] = payements;
        taille++;
    }
    public Payement[] getPayements() {
        return payements;
    }
    private int taille;
    public Facture(int id, String numero, double montant) {
        this.id = id;
        this.numero = numero;
        this.montant = montant;
    }
    public static int getN() {
        return N;
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
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public void setPayements(Payement[] payements) {
        this.payements = payements;
    }
    public int getTaille() {
        return taille;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }
    @Override
    public String toString() {
        return "Facture [id=" + id + ", numero=" + numero + ", montant=" + montant + ", commande=" + commande + "]";
    }
}
