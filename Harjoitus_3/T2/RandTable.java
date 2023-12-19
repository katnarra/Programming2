package Harjoitus_3.T2;
import java.util.Random;

public class RandTable {
  
   //attribuutit
   private int currentPosition;
   private int [] table;
   
   //konstruktorit eli muodostimet
   public RandTable(final int size, final int max) {
      table = new int[size];
      Random generator = new Random();
      for (int index = 0; index < table.length; index++) {
         table[index] = 1 + generator.nextInt(max); // 10: 1...10
      }
      currentPosition = 0;
   }
   
   //metodit
   public int nextNumber() {
      if (currentPosition < table.length) {
         return table[currentPosition++];
      }
      return -1;
   }
}


