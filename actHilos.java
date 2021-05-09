//Luis Manuel Artiaga Cortes

import java.util.*;

public class actHilos {

   public static int vector[]= new int [5];
   public static int vector2[]= new int [5];
   public static int x=0;

   
   public static void main (String args[]){
      
      Hsuma s = new Hsuma();
      Hpot p = new Hpot();
      Hmedia m = new Hmedia();
      s.start();
      p.start();
      m.start();
   }
   
   public static int[] vec(){
      for (x=0; x<vector.length; x++){
            vector[x]= (int)(Math.random()*11);
            System.out.println ("numero ["+(x+1)+"]: "+vector[x]);
      }
      return vector;
   }   
}