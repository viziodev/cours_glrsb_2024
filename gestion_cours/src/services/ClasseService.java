package services;


import entity.Classe;
//ClasseService estService
public class ClasseService extends Service<Classe> {
      //RechercheUneClasseParId
      public   Classe showById(int id){
         for (Classe classe: datas) {
             if (classe.getId()==id) {
                 return classe;
             }
         } 
         return null;
       }
    
}
