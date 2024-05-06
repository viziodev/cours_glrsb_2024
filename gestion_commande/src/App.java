import java.util.Scanner;

import entity.Produit;
import service.ProduitService;

;

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
                  break;
              case 4:
                
                 break;
              case 5:
                 
                break;
              default:
                  break;
            }
      } while (choix!=4);
    }

    public static int menu(){ 
        System.out.println("1-Enregistrer Produit");
        System.out.println("2-Lister les  Lister Produit");
        System.out.println("3-Enregistrer Commande");
        System.out.println("4-Listerles Commandes");
        System.out.println("7-Quitter");
         return scanner.nextInt();
     }

     public static Produit saisieProduit(){
        Produit produit=new Produit();
        System.out.println("Entrer le Libelle");
        produit.setLibelle(scanner.nextLine());
        System.out.println("Entrer le Prix");
        produit.setPrix(scanner.nextInt());
        return produit;
   }

   public static void afficheProduit(){
    for (Produit produit: ProduitService.listerProduit()) {
        if (produit!=null) {
            System.out.println(produit);
        }
     }
}
 
}
