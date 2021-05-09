//Luis Manuel Artiaga Cortes

public class Hmedia extends Thread {
   @Override
   public void run(){
      double prom=0;
      actHilos vect = new actHilos();
      
      int[] vectorM = vect.vec();
      
      for (int x=0; x<vectorM.length; x++){
         prom=prom+vectorM[x]; 
      }
      prom=prom/5;
      System.out.println ("La media es de "+prom);
   }
}