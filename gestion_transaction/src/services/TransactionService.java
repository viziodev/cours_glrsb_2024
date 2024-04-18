package services;

import entities.Transaction;
import entities.Type;

public class TransactionService {
    //Tableau ==> Objets
        //1-Tableau de valeurs
             //type tab[]=new type[NBRECELLULE];
            //Tableau dont les cellules des valeurs de type primitif(int, double, float,...)
                //Tableau d'entiers
                // int t[]=new int[10];
                    //t=> |1|0|0|0|0|0|0|....|0|
                     // t[0]=1;
                      //t.length  ==> NBRECELLULE  ==>10
                 //boolean t1[]=new boolean[10];
                   //t1=> |false|false|false|false|false|false|false|....|false|
        //2-Tableau Objets
           //Tableau dont les cellules contiennent des references adresse
                    //Transaction transactions[]=new Transaction[10];
                    //chaine=> |4a|null|null|null|null|null|null|....|null|
                        // transactions[0]=new Transaction();
                       private final int N=10;
                       private Transaction[] t=new Transaction[N]; 
                       int n;//0
                       public void addTransaction(Transaction trans)
                       { 
                               if(n<N){
                                 t[n] =trans;
                                  n=n+1;
                               }
                       }
                       public void listerTransaction(){
                          for (int index = 0; index < n; index++) {
                           System.out.println(t[index].toString());
                          
                          }
                       }
                       public void listerTransaction(Type type){
                        for (int index = 0; index < n; index++) {
                             if (t[index].getTypeTrans()==type) {
                                System.out.println(t[index].toString());
                             }
                        }
                     }
                      
              
                    

}      
