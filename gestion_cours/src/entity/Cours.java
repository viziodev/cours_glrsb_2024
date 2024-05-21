package entity;

import java.util.ArrayList;

import entity.enums.Statut;

public class Cours {
      private int id;
      private  static int nbre;
      private String module;
      private String professeur;
      private  Statut statut;
      ArrayList<Classe> classes=new ArrayList<>();
       
    public ArrayList<Classe> getClasses() {
        return classes;
    }
    public void add(Classe classe){
          classes.add(classe);
    }
    public Cours() {
        nbre++;
        id=nbre;
    }
    
    public Cours(String module, String professeur) {
        this.module = module;
        this.professeur = professeur;
        nbre++;
        id=nbre;
    }
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
    public String getModule() {
        return module;
    }
    public void setModule(String module) {
        this.module = module;
    }
    public String getProfesseur() {
        return professeur;
    }
    public void setProfesseur(String professeur) {
        this.professeur = professeur;
    }
    @Override
    public String toString() {
        return "Cours [id=" + id + ", module=" + module + ", professeur=" + professeur + ", statut=" + statut + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((module == null) ? 0 : module.hashCode());
        result = prime * result + ((professeur == null) ? 0 : professeur.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cours other = (Cours) obj;
        if (id != other.id)
            return false;
        if (module == null) {
            if (other.module != null)
                return false;
        } else if (!module.equals(other.module))
            return false;
        if (professeur == null) {
            if (other.professeur != null)
                return false;
        } else if (!professeur.equals(other.professeur))
            return false;
        return true;
    }
    public Statut getStatut() {
        return statut;
    }
    public void setStatut(Statut statut) {
        this.statut = statut;
    }
    public void setClasses(ArrayList<Classe> classes) {
        this.classes = classes;
    }
    
    
}
