package service;

import entity.Produit;

public   class ProduitService {
    private static final int N=10;
    private static Produit[] produits=new Produit[N];
    private static  int taille; 
    private  ProduitService(){

    } 
    public  static boolean add(Produit produit){
         if (taille==N) return false;
         produits[taille] =produit;
        return true;
    }

     public  static Produit[] listerProduit(){
          return    produits;
      }
}
