package services;

import java.util.ArrayList;

import entity.Entity;

public class EntityService {
       ArrayList<Entity> entities=new ArrayList<>();
      public void save(Entity entity){
          entities.add(entity);
      }
   public   ArrayList<Entity> getAll(){
          return  entities;
      }

}
