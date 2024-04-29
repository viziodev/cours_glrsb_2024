package services;

import entities.Commande;
import entities.Statut;

public class CommandeService {
    private final static  int  N=5;
    private Commande[] tab=new Commande[N]; 
    private int nbreCommande; 

    public Commande rechercherCommande(String reference)
  {
       for (Commande cmde : tab) {
           //
           if (cmde!=null && cmde.getReference().compareToIgnoreCase(reference)==0) {
              return cmde;
           }
       }
       return null;
  }

  public void ajouterCommande(Commande commande){
      if (nbreCommande<N) {
            tab[nbreCommande++]=commande;
      }
  }

  public void listerCommande(){
    for (Commande cmde : tab) {
        if (cmde!=null ) {
             System.out.println(cmde.toString());
        }
    }
   }

   public void listerCommande(Statut statut){
    for (Commande cmde : tab) {
        if (cmde!=null && cmde.getStatut()==statut ) {
             System.out.println(cmde);
        }
    }
   }

}
