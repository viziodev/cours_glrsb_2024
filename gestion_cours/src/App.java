
import java.util.Scanner;

import services.ClasseService;
import services.CoursService;
import views.ClasseView;
import views.CoursView;


public class App {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
          ClasseService classeService=new ClasseService();
          ClasseView classeView =new  ClasseView(scanner);
          CoursService coursService=new CoursService();
          CoursView coursView=new CoursView(scanner, classeView, classeService);
         int choix;
        
        do {
               choix=menu(); 
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
                    System.out.println("Fin du Programme .....");
                  break;
                default:
                   System.out.println("Veuillez faire un bon choix");
                    break;
               }
        } while (choix!=5);
        scanner.close();
    }

    public static int menu(){
        System.out.println("1-Creer Classe");
        System.out.println("2-Lister Classe\n" 
                          +"3-Créer un Cours\n" 
                          +"4-Lister Tous les cours" );
        System.out.println("5-Quitter");
        return scanner.nextInt();

    }
   


}
