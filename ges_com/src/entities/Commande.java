package entities;

public class Commande {
      private int id;
      private static int nbreCommande;
      private String reference;
      private double montant;
      private String date;
      private Statut statut;
      //ManyToOne ==> Plusieurs commandes associees a un client
      private Client client;
   

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Commande(String reference, double montant, String date, Statut statut) {
        nbreCommande++;
        id=nbreCommande;
        this.reference = reference;
        this.montant = montant;
        this.date = date;
        this.statut = statut;
    }

    public Commande() {
        nbreCommande++;
        id=nbreCommande;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNbreCommande() {
        return nbreCommande;
    }

    public static void setNbreCommande(int nbreCommande) {
        Commande.nbreCommande = nbreCommande;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((reference == null) ? 0 : reference.hashCode());
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
        Commande other = (Commande) obj;
        if (id != other.id)
            return false;
        if (reference == null) {
            if (other.reference != null)
                return false;
        } else if (!reference.equals(other.reference))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Commande [id=" + id + ", reference=" + reference + ", montant=" + montant + ", date=" + date
                + ", statut=" + statut + ", client=" + client + "]";
    }

   

      
}
