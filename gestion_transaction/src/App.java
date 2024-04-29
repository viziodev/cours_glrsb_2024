import java.util.Scanner;

import entities.Transaction;
import entities.Type;
import services.TransactionService;
public class App {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //1. Ajouter une Transaction dans le Tableau
        // 2.Lister toutes Transactions du Tableau
        //3.Lister les Transactions du Tableau Par Type
       
        TransactionService transactionService=new TransactionService();
        int choix, id, type;
        double montant; 
        Type typeTrans;
        Transaction t;
        do {
             System.out.println("1. Ajouter une Transaction dans le Tableau"); 
             System.out.println("2. Lister toutes Transactions du Tableau"); 
             System.out.println("3. Lister les Transactions du Tableau Par Type"); 
             System.out.println("4. Quitter"); 
             choix=scanner.nextInt();
             switch (choix) {
                case 1:
               // System.out.println("Entrer l’id");
               // id=scanner.nextInt();
                System.out.println("Entrer le Montant");
                montant=scanner.nextDouble();
                typeTrans=saisieTransaction();
                t=new Transaction(montant, typeTrans);
                t.getNbreTrans();
                //Transaction.taux=0.09;
                transactionService.addTransaction(t);
                break;

                case 2:
                  transactionService.listerTransaction();
                    break;

                case 3:
                
                    transactionService.listerTransaction(saisieTransaction()); 
                    break;
                default:
                    break;
             }

        } while (choix!=4);
          scanner.close();

        //System ==>SE
              //in(fichier de la lecture) ==> Par defaut le Clavier
              //Scanner le Clavier  
                  // ==>Scanner ==> lire  un fichier est de recuperer les donnes
                            //  ==> formater 
                                     //nextType()     nextInt(), nextDouble(), nextFloat()...
                                     //next()  ==> scanner un mot
                                     //nextLine()  ==> scanner plusieurs mots
                                
                
             //out(fichier de la ecriture) ==> Par defaut le Ecran
         
    }

public static Type  saisieTransaction(){
  int type;
  System.out.println("Entrer le Type");
  do {
       System.out.println("1-Retrait");
       System.out.println("2-Depot");
      type=scanner.nextInt();
  } while (type<1 || type>2);
   return  type==1?Type.Retrait:Type.Depot;
}


}
