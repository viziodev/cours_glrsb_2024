package views;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Classe;
import entity.enums.Filiere;
import entity.enums.Niveau;

//CoursView est View
public class ClasseView extends View {
       //this ==> cet objet ==> objet de ClasseView
       //super 
    
     public ClasseView(Scanner scanner) {
        super.scanner = scanner;
     }
     
     public  Classe saisie(){
            Filiere filiere=saisieFiliere();  
            Niveau niveau= saisieNiveau();
            return new Classe(niveau,filiere);
     }
    public  Filiere saisieFiliere(){
        int filiereInt;
        for (Filiere filiere : Filiere.values()) {
            System.out.println((filiere.ordinal()+1)+"- "+filiere.name()); 
        }
        do {
          System.out.println("Entrer une Filiere");
          filiereInt =scanner.nextInt();  
        } while (filiereInt<1 || filiereInt>Filiere.values().length);
        return Filiere.values()[filiereInt-1];
    }
    //1-L1
    //2-L2
    public  Niveau saisieNiveau(){
        int niveauInt;
          for (Niveau niveau : Niveau.values()) {
              System.out.println((niveau.ordinal()+1)+"- "+niveau.name()); 
          }
        do {
            System.out.println("Entrer un niveau");
            niveauInt =scanner.nextInt();  
        } while (niveauInt<1 || niveauInt>Niveau.values().length);
          return Niveau.values()[niveauInt-1];
    }

    public   void  affiche(ArrayList<Classe> classes){
          for (Classe classe : classes) {
              System.out.println(classe);
          }
    }
}
