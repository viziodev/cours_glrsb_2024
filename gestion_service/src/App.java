
import entity.Departement;
import entity.Entity;
import entity.Service;
import services.EntityService;

public class App {
    public static void main(String[] args) throws Exception {
       EntityService entityService =new EntityService();
       entityService.save(new Entity("001","Entity1"));
       entityService.save(new Service("002","Service1","Zone1"));
       entityService.save(new Departement("003","Departement1","Region1"));

       for (Entity entity : entityService.getAll()) {
           //Pour qu'une Classe Fille Rend une methode Polymorphe   
              //1-La Methode soit heritee
              //2-changer la definition de la methode herite ==> Redefinition de Methode
           System.out.println(entity.affiche());
       }

    }
}
