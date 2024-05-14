import java.util.Scanner;

import entity.Commande;
import entity.Facture;
import entity.Payement;
import entity.Produit;
import entity.ProduitCommande;
import service.CommandeService;
import service.ProduitService;

//Single Responsabilite
   //entity ==> Diagramme de 
     //Classe 
       //Association
            //OneToMany ou ManyToOne
            //ManyToMany
            //OneToOne
            //Heritage
   //UseCase ==> Service
      //Use case Produit ==> ProduitService
      //Use Case Commande ==> CommandeService
      //Use Case Facture ==> FactureService
    //Generalisation ==>Factorisation
      //Heritage
      //Interface



public class App {
     private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int choix;
        do {
            choix=menu();
            scanner.nextLine();
            switch (choix) {
              case 1:

                 ProduitService.add(saisieProduit());
              break;
              case 2:
                   afficheProduit();
              break;
              case 3:
                  CommandeService.add(saisieCommande());
                  break;
              case 4:
                  afficheAllCommande();
                
                 break;
               case 5:
               listeProduitsUneCommande();
                 break;
                 case 6:
               listePayementsUneCommande();
                   break;
              default:
                  break;
            }
      } while (choix!=7);
    }

    public static int menu(){ 
        System.out.println("1-Enregistrer Produit");
        System.out.println("2-Lister les  Lister Produit");
        System.out.println("3-Enregistrer Commande");
        System.out.println("4-Listerles Commandes");
        System.out.println("5-Lister des Produits une Commande");
        System.out.println("7-Quitter");
         return scanner.nextInt();
     }
     public static Commande saisieCommande(){
          Commande commande =new Commande();
          String libelle;
          Produit produit=null;
          char response;
          do {

                System.out.println("Entrer le Libelle");
                libelle =scanner.nextLine();   //bonjour a tous 
                produit =  ProduitService.findProduitByLibelle(libelle);
                if (produit!=null) {
                    System.out.println("Entrer la qte commande");
                       //ProduitCommande ==>  Produit
                       ProduitCommande produitCommande=new ProduitCommande(scanner.nextInt(),produit);
                       //commande ==>  ProduitCommande 
                       commande.addTab(produitCommande); 
                       //ProduitCommande ==> Commande
                       produitCommande.setCommande(commande);
                        //Produit vers ProduitCommande
                        produit.addTab(produitCommande);
                }

              System.out.println("Voulez vous continez a  ajouter des Produit O|N");
              response =scanner.next().charAt(0); 
              scanner.nextLine();
          } while (response=='O');

          //Generer la Facture
        
                 Facture fact= new Facture(commande);
           //Relation
                  //Facture vers Commande 
                    fact.setCommande(commande);
                  //Commande vers Facture
                    commande.setFacture(fact);
          //Je Peux faire un Payement

          do {
            scanner.nextLine();
            System.out.println("Voulez vous  ajouter un Payement O|N");
            response =scanner.next().charAt(0); 
            Payement payement;
               if (response=='O') {
                  payement=new Payement(); 
                  System.out.println("Entrer le Montant");
                  payement.setMontantVerser(scanner.nextDouble());
                  //Associations 
                    //Facture vers Payement
                     fact.addTab(payement);
                    //Payement vers Facture
                    payement.setFacture(fact);
               }
                scanner.nextLine();

        } while (response=='O');
          return  commande;
     }


     public static Produit saisieProduit(){
        String libelle;
        Produit produit=null;
        do {
             System.out.println("Entrer le Libelle");
             libelle =scanner.nextLine();   //bonjour a tous 
             produit =  ProduitService.findProduitByLibelle(libelle);
        } while (produit!=null);

          produit=new Produit();
          produit.setLibelle(libelle); 
          System.out.println("Entrer le Prix");
          produit.setPrix(scanner.nextInt());
          return produit;
   }

   public static void afficheProduit(){
    for (Produit produit: ProduitService.findAll()) {
        if (produit!=null) {
            System.out.println(produit);
        }
     }
   }

   public static void afficheCommande(Commande commande){
      System.out.println(commande);
      for (ProduitCommande produitCommande: commande.getTabProduitCommandes()) {
        if (produitCommande!=null) {
            System.out.println(
                "==== "+produitCommande.getProduit() 
                +"=== Qte Commande: "+produitCommande.getQteCmde() 
                +"=== Montant Commande: "+produitCommande.getMontant() 
            );
        }
     }
   }

   public static void afficheAllCommande(){
    for (Commande commande : CommandeService.findAll()) {
          if (commande!=null) {
              afficheCommande(commande) ;
          }
    }
  }

  public static void listeProduitsUneCommande(){
      System.out.println("Entrer le numero de la commande");
      String numero=scanner.nextLine();
   Commande cmde=   CommandeService.findCommandeByNumero(numero);
     if (cmde==null) {
          System.out.println("Ce numero n'existe pas");
     } else {
            afficheCommande(cmde);
     }
  }

  public static void listePayementsUneCommande(){
    System.out.println("Entrer le numero de la commande");
    String numero=scanner.nextLine();
    Commande cmde=   CommandeService.findCommandeByNumero(numero);
     if (cmde==null) {
        System.out.println("Ce numero n'existe pas");
      } else {
        System.out.println(" Numero: "+cmde.getNumero()
                          +" Date: "+cmde.getDateCmde()
                          +" Montant: "+cmde.getMontant()
                          +" Montant Verser: "+cmde.getFacture().getMontantVerser()
                          +" Montant Restant :  "+cmde.getFacture().getMontantRestant()

         );
          System.out.println("Payements");
          for (Payement payement : cmde.getFacture().getPayements()) {
            if (payement!=null) {
                System.out.println(payement);
            }
        
          }
   }
}
 
}
