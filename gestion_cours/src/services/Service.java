package services;

import java.util.ArrayList;

import entity.AbstractEntity;

//Par defaut Generique T est un Object 
// T herite d'une classe ayant la methode getId()
public class Service<T extends AbstractEntity> {
      protected ArrayList<T> datas=new ArrayList<>();
      public  ArrayList<T> show() {
        return datas;
       }
      public void  add(T data){
       datas.add(data);
      }

       public   T showById(int id){
         for (T data: datas) {
             if (data.getId()==id) {
                 return data;
             }
         } 
         return null;
       }
}
