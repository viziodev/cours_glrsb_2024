package views;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class View<T> {
      protected Scanner scanner;

     
      //T generique <T> T
       public abstract   T saisie();
      //Visibilite des attributs de la mere vers la fille
        //1-Attributs a prive ==> getters et Setters
        //2-Attributs a protected
       public   void   affiche(ArrayList<T> datas){
          for (T data : datas) {
              System.out.println(data);
          }
       }

       public View(Scanner scanner) {
          this.scanner = scanner;
        }

       
}
