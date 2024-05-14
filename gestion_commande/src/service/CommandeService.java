package service;

import entity.Commande;
import entity.Produit;

public class CommandeService {
      private static final int N=10;
      private static Commande[] commandes=new Commande[N];
      private static int taille;

       public  static boolean add(Commande commande){
           if (taille==N) return false;
           commandes[taille] =commande;
           taille++;
           return true;
        }

       public  static Commande[] findAll(){
          return    commandes;
       }

        public  static Commande  findCommandeByNumero(String numero){
        //strcmp(ch1,ch2) !=0
        //Pour comparer 2 chaines il faut eviter d'utiliser la methode equals
           for (Commande com : commandes) {
               if (com!=null && com.getNumero().compareTo(numero)==0) {
                   return com;
               }
           }
          return null; 
     }
        
}
