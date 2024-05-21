package services;


import entity.Cours;
//Service
public class CoursService extends Service<Cours> {
  public   Cours showById(int id){
         for (Cours cours: datas) {
             if (cours.getId()==id) {
                 return cours;
             }
         } 
         return null;
       }
}
