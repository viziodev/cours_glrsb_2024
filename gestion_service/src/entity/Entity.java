package entity;
public class Entity {
    private static int  nbre;
    protected  int id;
    protected String code;
    protected String name;
    //Polymorphisme 
       //1-Objets
         //==> Conversion entre les objets de la classe mere et les objets des classes filles
              //un objet Departement peut convertit en  un objet Entity ==>upcasting (par defaut)
             //un objet  Entity peut convertit en  un objet  Departement ==>downcasting  
       //2-Methodes

    public Entity() {
        id=nbre++;
    }

    public Entity(String code, String name) {
        id=nbre++;
        this.code = code;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String affiche() {
        return "Id=" + id + ", Code=" + code + ", Name=" + name ;
    }
}
