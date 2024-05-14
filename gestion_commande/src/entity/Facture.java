package entity;

public class Facture {
      //Constante
      private  static final int N=10;
      //Attribut
        private int id;
        private String numero;
        private double montant;
        private double montantVerser;
        private double montantRestant;
       
       //Attribut

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
            montantVerser+=payements.getMontantVerser();
            montantRestant=montant-montantVerser;
            taille++;  
        }
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

    public Facture(Commande commande) {
        this.id = commande.getId();
        this.numero ="FACT"+commande.getNumero().substring(3,7);
        this.montant = commande.getMontant();
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
  
    public int getTaille() {
        return taille;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }
   

    public double getMontantVerser() {
        return montantVerser;
    }
    public void setMontantVerser(double montantVerser) {
        this.montantVerser = montantVerser;
    }

     public double getMontantRestant() {
        return montantRestant;
    }
    public void setMontantRestant(double montantRestant) {
        this.montantRestant = montantRestant;
    }
    @Override
    public String toString() {
        return "Facture [numero=" + numero 
                + ", montant=" + montant 
                + ", montantVerser=" + montantVerser
                + ", montantRestant=" + montantRestant + "]";
    }
}
