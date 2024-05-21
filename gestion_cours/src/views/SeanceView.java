package views;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entity.Seance;
import entity.enums.Statut;

public  class SeanceView extends View<Seance> {

     public SeanceView(Scanner scanner) {
          super(scanner);
     }
     
    @Override
     public Seance saisie() {
           scanner.nextLine();
           Seance seance=new Seance();
          //Saisie de la Date
            System.out.println("Entrer la Date jj/mm/aaaa");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String date=scanner.nextLine();
            seance.setDate(LocalDate.parse(date,formatter));
          //Saisie de l'heure de Debut
            System.out.println("Entrer l'heure de Debut  de la Seance HH:mm");
            formatter=DateTimeFormatter.ofPattern("HH:mm");
            String heureDb=scanner.nextLine();
            seance.setHeureDb(LocalTime.parse(heureDb,formatter));
          //Saisie de l'heure de Fin
            System.out.println("Entrer l'heure de Fin  de la Seance HH:mm");
            formatter=DateTimeFormatter.ofPattern("HH:mm");
            String heureFin=scanner.nextLine();
            seance.setHeureFin(LocalTime.parse(heureFin,formatter));
          //Mettre le Statur a Planier
             seance.setStatut(Statut.Planifier);
             return seance;
      }
    
}
