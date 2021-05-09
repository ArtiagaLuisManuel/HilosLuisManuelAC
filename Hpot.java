//Luis Manuel Artiaga Cortes

import java.util.*;

public class Hpot extends Thread {
   @Override
   public void run(){
      double cuadra=0;
      actHilos vect = new actHilos();
      
      int[] vectorC = vect.vec();
      
      for (int x=0; x<vectorC.length; x++){
         cuadra=cuadra+(Math.pow(vectorC[x],2));
      }
      System.out.println ("Al cuadrado dan: "+cuadra);
   }
}