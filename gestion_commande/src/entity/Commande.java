package entity;

import java.time.LocalDate;

public class Commande {
    //Constante
    private  static final int N=10;
     //Attribut
     private static int nbreCmde;
     private int id;//Generer Id
     private String numero;//Generer numero
     private double montant;//Calculer montant
     private LocalDate dateCmde;//Date du Jour
    
    public LocalDate getDateCmde() {
        return dateCmde;
    }
    public void setDateCmde(LocalDate dateCmde) {
        this.dateCmde = dateCmde;
    }
    public Commande() {
        //Creer un Objet et Initialiser les Attributs
        //Generer numero
          nbreCmde++;
          id=nbreCmde;
        //Date du Jour
          dateCmde=LocalDate.now();
          //Generer Numero
          int size= String.valueOf(id).length();
          numero="COM"+"0".repeat(4-size<0?0:4-size)+id;
    }


    //Propriete Association
    //OneToMany
    private ProduitCommande[] tabProduitCommandes=new ProduitCommande[N];
    private int taille;
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
        return "Commande [id=" + id + ", numero=" + numero 
               + ", montant=" + montant 
               + ", dateCmde=" + dateCmde
              + ", facture=" + facture + "]";
    }
   
    
}
