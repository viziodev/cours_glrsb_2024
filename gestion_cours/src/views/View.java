package views;

import java.util.Scanner;

public abstract class View {
    protected Scanner scanner;
     //T generique <T> T
    public abstract  <T> T saisie();
      //Visibilite des attributs de la mere vers la fille
        //1-Attributs a prive ==> getters et Setters
        //2-Attributs a protected
}
