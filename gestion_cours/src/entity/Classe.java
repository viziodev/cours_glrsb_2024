package entity;

import java.util.ArrayList;

import entity.enums.Filiere;
import entity.enums.Niveau;

public class Classe extends AbstractEntity {
     private String nomClasse;
     private Niveau niveau;
     private Filiere filiere;
     private ArrayList<Cours> coursList=new ArrayList<>();

     public void  add(Cours cours){
           coursList.add(cours);
     }
    public ArrayList<Cours> getCoursList() {
        return coursList;
    }
    public Classe( Niveau niveau, Filiere filiere) {
        nbre++;
        this.id = nbre;
        this.nomClasse = niveau.name() +""+filiere.name() ;
        this.niveau = niveau;
        this.filiere = filiere;
    }
    public Classe() {
        nbre++;
        this.id = nbre;
    }
   
    public String getNomClasse() {
        return nomClasse;
    }
    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }
    public Niveau getNiveau() {
        return niveau;
    }
    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }
    public Filiere getFiliere() {
        return filiere;
    }
    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
    @Override
    public String toString() {
        return "Classe [id=" + id + ", nomClasse=" + nomClasse + ", niveau=" + niveau + ", filiere=" + filiere + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nomClasse == null) ? 0 : nomClasse.hashCode());
        result = prime * result + ((niveau == null) ? 0 : niveau.hashCode());
        result = prime * result + ((filiere == null) ? 0 : filiere.hashCode());
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
        Classe other = (Classe) obj;
        if (id != other.id)
            return false;
        if (nomClasse == null) {
            if (other.nomClasse != null)
                return false;
        } else if (!nomClasse.equals(other.nomClasse))
            return false;
        if (niveau != other.niveau)
            return false;
        if (filiere != other.filiere)
            return false;
        return true;
    }
    
     
     
     
}
