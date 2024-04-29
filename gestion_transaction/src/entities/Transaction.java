package entities;
public class Transaction {
    private int id;//0
    private double montant;//0.0
    private Type typeTrans;//classe ou enumeration ==>null
                           //booleen ==> false
    public  final double cout=0.01;
    //Attribut de classe
    private static int nbreTrans;
    public final static double taux=0.05;

    public Transaction(double montant, Type typeTrans) {
        nbreTrans++;
        this.id=  nbreTrans;
        this.montant = montant;
        this.typeTrans = typeTrans;
    }
    public Transaction(){

    }
    public Transaction(int id,double montant,Type typeTrans){
        this.id=id;
         this.montant=montant;
         this.typeTrans=typeTrans;
   }
   public  int getNbreTrans(){
        return nbreTrans;
   }

   

    public  int getId(){
      return id;
    }
    public double getMontant(){
        return montant;
      }
      public Type getTypeTrans(){
        return typeTrans;
      }

    public void setId(int id){
        this.id=id;
    }
    public void setMontant(double montant){
        this.montant=montant;
    }

    public void setTypeTrans(Type typeTrans){
        this.typeTrans=typeTrans;
    }

    public String toString(){
        return "ID: "+id+" Montant: "+montant+" Type: "+typeTrans;
    }
    public boolean equal(Transaction t2){
        return   this.id==t2.getId() && this.typeTrans==t2.getTypeTrans();
    }
    
    public Transaction clone(Transaction t1){
        return new Transaction(t1.getId(),t1.getMontant(),t1.getTypeTrans());
    }


}
