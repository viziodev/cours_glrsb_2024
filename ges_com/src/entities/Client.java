package entities;

public class Client {
    private int id;
    private static int nbreClient;
    private String nomComplet;
    private final static int N=5;
     //OneMany ==> 1 Objet Client associe a plusieurs commandes
     //Proprietes navigables ==>issue des relations
      private Commande[] commandes=new Commande[N];


    public Client(String nomComplet) {
        nbreClient++;
        id=nbreClient;
        this.nomComplet = nomComplet;
    }
    public Client() {
        nbreClient++;
        id=nbreClient;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static int getNbreClient() {
        return nbreClient;
    }
    public static void setNbreClient(int nbreClient) {
        Client.nbreClient = nbreClient;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    @Override
    public String toString() {
        return "Client [id=" + id + ", nomComplet=" + nomComplet + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
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
        Client other = (Client) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
}
