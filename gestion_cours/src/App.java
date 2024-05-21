
import java.util.ArrayList;
import java.util.Scanner;

import entity.Classe;
import entity.Cours;
import entity.Seance;
import services.ClasseService;
import services.CoursService;
import views.ClasseView;
import views.CoursView;
import views.SeanceView;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ClasseService classeService = new ClasseService();
        ClasseView classeView = new ClasseView(scanner);
        CoursService coursService = new CoursService();
        CoursView coursView = new CoursView(scanner, classeView, classeService);
        SeanceView seanceView=new SeanceView(scanner);

        int choix;
        char rep;
        int idCours;
        ArrayList<Cours>  coursList;

        do {
            choix = menu();
            switch (choix) {
                case 1:
                    classeService.add(classeView.saisie());
                    break;
                case 2:
                    classeView.affiche(classeService.show());
                    break;
                case 3:
                    coursService.add(coursView.saisie());
                    break;
                case 4:
                    coursView.affiche(coursService.show());
                    break;
                case 5:
                 
                    int idClasse;
                    ArrayList<Classe> classes = classeService.show();
                    do {
                        classeView.affiche(classes);
                        idClasse = scanner.nextInt();
                        Classe classe = classeService.showById(idClasse);
                          if (classe != null) {
                               coursView.affiche(classe.getCoursList());
                          }else{
                             System.out.println("Cette classe n'existe pas");
                          }
                         System.out.println("Voulez vous Lister les cours d'une  autre classe O/N");
                        rep = scanner.next().charAt(0);
                     } while (rep == 'O');
                    break;
                    case 6:
                      coursList=   coursService.show();
                       do {
                        coursView.affiche(coursList);
                        System.out.println("Entrer Id d'un Cours");
                        idCours = scanner.nextInt();
                         Cours cours=coursService.showById(idCours);
                           if (cours != null) {
                               classeView.affiche(cours.getClasses());
                           }else{
                             System.out.println("Ce cours n'existe pas");
                          }
                         System.out.println("Voulez vous Lister les classes d'un  autre cours O/N");
                        rep = scanner.next().charAt(0);
                     } while (rep == 'O');
                    break;
                    case 7:
                     coursList=   coursService.show();
                    do {
                     coursView.affiche(coursList);
                     System.out.println("Entrer Id d'un Cours");
                     idCours = scanner.nextInt();
                      Cours cours=coursService.showById(idCours);
                        if (cours != null) {
                            char rep1;
                                do {
                                     Seance  seance=  seanceView.saisie();
                                     //Relation de Cours vers Seance
                                       cours.addSeance(seance);
                                     //Relation Seance vers cours
                                       seance.setCours(cours);
                                     System.out.println("Voulez creer une nouvelle  Seance O/N");
                                    rep1 = scanner.next().charAt(0);
                                } while (rep1 == 'O');   
                        }else{
                          System.out.println("Ce cours n'existe pas");
                       }
                      System.out.println("Voulez vous ajouter une seance a une autre classe O/N");
                     rep = scanner.next().charAt(0);
                  } while (rep == 'O');
                    break;
                case 8:
                    System.out.println("Fin du Programme .....");
                    break;
                default:
                    System.out.println("Veuillez faire un bon choix");
                    break;
            }
        } while (choix != 8);
        scanner.close();
    }

    public static int menu() {
        System.out.println("1-Creer Classe");
        System.out.println("2-Lister Classe\n"
                + "3-Créer un Cours\n"
                + "4-Lister Tous les cours\n"
                + "5-Lister Tous les cours d'une Classe\n"
                + "6-Lister Toutes les classes d'un Cours\n"
                + "7-Creation d'une Seance de Cours");
        System.out.println("8-Quitter");
        return scanner.nextInt();

    }

}
