package controllers;

import models.Car;

public class CarController {
  public void sortByName(Car[] cars){
    //BurbujaAvanzado

    int n=cars.length;
    boolean y;

    for(int i =0;i<n;i++){
      y=false;      
      for(int j = 0; j < n-1; j++){
        if(cars[j].getName().compareTo(cars[j+1].getName()) > 0){
          Car aux=cars[j];
          cars[j]=cars[j+1];
          cars[j+1]=aux;
          y=true;

        }

        
      }
      if(!y){
        break;

      }
    }



  }
  
}
