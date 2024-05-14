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
         taille++;
        return true;
      }

     public  static Produit[] findAll(){
          return    produits;
      }
      public  static Produit  findProduitByLibelle(String libelle){
        //strcmp(ch1,ch2) !=0
        //Pour comparer 2 chaines il faut eviter d'utiliser la methode equals
           for (Produit p : produits) {
               if (p!=null && p.getLibelle().compareTo(libelle)==0) {
                   return p;
               }
           }
          return null; 
     }

}
