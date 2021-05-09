//Luis Manuel Artiaga Cortes

//Luis Manuel Artiaga Cortes

public class Hsuma extends Thread {
   @Override
   public void run(){
      int suma=0;
      actHilos vect = new actHilos();
      
      int[] vectorS =vect.vec();
      
      for (int x=0; x<vectorS.length; x++){
         suma=suma+vectorS[x]; 
      }
      System.out.println ("La suma es de "+suma);
   }
}