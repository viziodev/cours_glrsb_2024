package entity;
public class Departement extends Entity {
       private String region;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Departement(String code, String name, String region) {
        super(code, name);
        this.region = region;
    }

    public Departement() {
         //le mot super  represente la classe mere dans la fille
         // super()  constructeur sans argument du parent
         super();
    }

    public String generateCode(){
        return "DEPT";
    }
  
    @Override
    public String affiche() {
        return  super.affiche() +", Region=" + region ;
    }

    
       
}
