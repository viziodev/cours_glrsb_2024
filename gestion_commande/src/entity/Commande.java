package entity;

public class Commande {
    //Constante
    private  static final int N=10;
     //Attribut
     private int id;
     private String numero;
     private double montant;
    //Propriete Association
    //OneToMany
    private ProduitCommande[] tabProduitCommandes=new ProduitCommande[N];
    public ProduitCommande[] getTabProduitCommandes() {
        return tabProduitCommandes;
    }
    public void addTab(ProduitCommande produitCommande){
      if (taille<N) {
           montant+=produitCommande.getMontant();
           tabProduitCommandes[taille]=produitCommande;
          taille++;
      }
    }
    private int taille;

    
    //OneToOne
    private Facture facture;
    public Commande(int id, String numero) {
        this.id = id;
        this.numero = numero;
    }
    public Facture getFacture() {
        return facture;
    }
    public void setFacture(Facture facture) {
        this.facture = facture;
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
    public void setTabProduitCommandes(ProduitCommande[] tabProduitCommandes) {
        this.tabProduitCommandes = tabProduitCommandes;
    }
    public int getTaille() {
        return taille;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }
    @Override
    public String toString() {
        return "Commande [id=" + id + ", numero=" + numero + ", montant=" + montant + ", facture=" + facture + "]";
    }
    
}
