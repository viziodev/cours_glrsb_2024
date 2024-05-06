
import java.util.Scanner;

import entities.Client;
import entities.Commande;
import entities.Statut;
import services.ClientService;
import services.CommandeService;

public class App {
      private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int choix;
        CommandeService commandeService=new CommandeService();
        ClientService clientService=new ClientService();

        do {
              choix=menu();
              scanner.nextLine();
              switch (choix) {
                case 1:
                    clientService.ajouterClient(saisieClient());
                break;
                case 2:
                   clientService.listerClient();

                break;
                case 3:
                   System.out.println("Entrer l'id");
                     int idClient=scanner.nextInt();
                     //Rechercher le client par id
                     Client cl=clientService.rechercherClient(idClient);
                     if (cl==null) {
                          System.out.println("Ce client existe pas");
                     } else {
                          scanner.nextLine();
                          System.out.println("Entrer la Reference");
                          String ref=scanner.nextLine();
                         if(commandeService.rechercherCommande(ref)==null){
                           Commande cmde= saisieCommande();
                           cmde.setReference(ref);
                           //Creer la relation ManyToOne Commande vers Client
                             cmde.setClient(cl);
                             commandeService.ajouterCommande(cmde);
                        }else{
                            System.out.println("Cette  Reference  existe deja");
                        }
                     }
                      
                    
                    break;
                case 4:
                    commandeService.listerCommande();
                   break;
                case 5:
                     commandeService.listerCommande(saisieStatus());
                  break;
                default:
                    break;
              }
        } while (choix!=4);
        scanner.close();
    }

    public static int menu(){
       
       System.out.println("1-Enregistrer Client");
       System.out.println("2-Lister les  Clients");
       System.out.println("3-Enregistrer Commande");
       System.out.println("4-Lister Toutes les Commandes");
       System.out.println("5-Lister les Commandes par Statut");
       System.out.println("6-Lister les Commandes d'un client");
       System.out.println("7-Quitter");
        return scanner.nextInt();

    }

    public static Commande saisieCommande(){
         Commande cmde =new Commande();
        System.out.println("Entrer la Date");
        cmde.setDate(scanner.nextLine());
        System.out.println("Entrer le Montant");
        cmde.setMontant(scanner.nextDouble());
        cmde.setStatut( saisieStatus());
        return cmde;

    }

    public static Client saisieClient(){
        Client client =new Client();
       System.out.println("Entrer la Nom et Prenom");
       client.setNomComplet(scanner.nextLine());
       return client;

   }

   
    public static Statut saisieStatus(){
       int statut;
       do {
           System.out.println("1-Paye");
           System.out.println("2-Impaye");
           statut=scanner.nextInt();
       } while (statut!=1 && statut!=2);
        return Statut.values()[statut-1];
    }


}
