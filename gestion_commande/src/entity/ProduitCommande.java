package entity;

public class ProduitCommande {
    private  int qteCmde;
    private int montant;
    //Association ou Propriete Navigable
    //ManyToOne
    private Commande commande;
    private Produit produit;

    public int getMontant() {
        return montant;
    }
    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Produit getProduit() {
        return produit;
    }
    public void setProduit(Produit produit) {
        this.produit = produit;
        this.montant=produit.getPrix()*qteCmde;
    }

    public ProduitCommande(int qteCmde, Produit produit) {
        this.qteCmde = qteCmde;
        this.produit = produit;
        this.montant=produit.getPrix()*qteCmde;
    }
    public ProduitCommande(int qteCmde) {
        this.qteCmde = qteCmde;
    }
    public Commande getCommande() {
        return commande;
    }
    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    public int getQteCmde() {
        return qteCmde;
    }
    public void setQteCmde(int qteCmde) {
        this.qteCmde = qteCmde;
    }
    @Override
    public String toString() {
        return "ProduitCommande [qteCmde=" + qteCmde + ", montant=" + montant + "]";
    }
  

}
