package services;

import entities.Client;

public class ClientService {
    private final static  int  N=5;
    private Client[] tab=new Client[N]; 
    private int nbreClient; 

     public void ajouterClient(Client client){
      if (nbreClient<N) {
            tab[nbreClient++]=client;
      }
  }

  public void listerClient(){
    for (Client client : tab) {
        if (client!=null ) {
             System.out.println(client);
        }
    }
   }

     public Client rechercherClient(int id)
    {
       for (Client client : tab) {
           if (client!=null && client.getId()==id) {
                return client;
           }
       }
       return null;
    }


}
