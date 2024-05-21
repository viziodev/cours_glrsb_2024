package views;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Classe;
import entity.Cours;
import entity.enums.Statut;
import services.ClasseService;

//CoursView est View
public class CoursView extends View {
     //this ==> cet objet ==> objet de CoursView
     //super ==> un Objet de la classe mere ==>objet de View 
     private ClasseView classeView;
     private ClasseService classeService;
    
    public CoursView(Scanner scanner, ClasseView classeView, ClasseService classeService) {
        super.scanner=scanner;
        this.classeView = classeView;
        this.classeService = classeService;
    }
   /**
    *  Genericite ==> 
    *  methodes abstraites 
    */
    public Cours saisie(){
       Cours cours=new Cours();
       scanner.nextLine();
       System.out.println("Entrer le Professeur");
       cours.setProfesseur(scanner.nextLine());
       System.out.println("Entrer le Module");
       cours.setModule(scanner.nextLine());
       cours.setStatut(Statut.Planifier);
       char rep;
       int idClasse;
       //Copie 
        ArrayList<Classe> classes=(ArrayList)classeService.show().clone();//Classes du service
       do {
          classeView.affiche(classes);
          idClasse=scanner.nextInt();
          Classe classe=classeService.showById(idClasse);
          if (classe!=null) {
            //Cours vers Classe
             cours.add(classe);
            //Classe vers Cours
             classe.add(cours);
             classes.remove(classe);
          }
          System.out.println("Voulez vous ajouter une autre classe O/N");
          rep=scanner.next().charAt(0);
       } while (rep=='O' ||  cours.getClasses().isEmpty());
       return cours;
     }

     public   void  affiche(ArrayList<Cours> coursList){
        for (Cours cours : coursList) {
            System.out.println(cours);
        }
  }

}
