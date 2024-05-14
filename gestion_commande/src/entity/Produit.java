package entity;

public class Produit {
    private String libelle;
    private int prix;
    public int getPrix() {
        return prix;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }
    //OneToMany
    private  static final int N=10;
    private ProduitCommande[] tabProduitCommandes=new ProduitCommande[N]; 
    private int taille;
    public ProduitCommande[] getTabProduitCommandes() {
        return tabProduitCommandes;
    }
    public void addTab(ProduitCommande produitCommande){
        if (taille<N) {
          tabProduitCommandes[taille]=produitCommande;
           taille++;
        }
      }

    public Produit() {
    }
    public Produit(String libelle, int prix) {
        this.libelle = libelle;
        this.prix = prix;
    }
    public Produit(String libelle) {
        this.libelle = libelle;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public static int getN() {
        return N;
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
        return "Produit [libelle=" + libelle + ", prix=" + prix + "]";
    }
   
}
