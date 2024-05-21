package entity;

public abstract class AbstractEntity {
    protected int id;
    protected  static int nbre;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static int getNbre() {
        return nbre;
    }
    public static void setNbre(int nbre) {
        Cours.nbre = nbre;
    }
}
