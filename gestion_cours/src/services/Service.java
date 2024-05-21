package services;

import java.util.ArrayList;


public class Service<T> {
    protected ArrayList<T> datas
       =new ArrayList<>();
     public  ArrayList<T> show() {
        return datas;
     }
    public void  add(T data){
       datas.add(data);
     }
}
