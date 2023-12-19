package Harjoitus_3.T2;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;

public class H3T2_Main {
   
   private static Scanner lukija = new Scanner(System.in).useLocale( new Locale("us", "US") ); //windows saattaa muuten vaatia desimaalipisteen sijaan desimaalipilkkua

   public static void main( String [] args ){
      System.out.println("Täällä arvotaan satunnaisia lukuja taulukkoon!");
      System.out.print("Anna numeroiden määrä: ");
      int size = lukija.nextInt();
      lukija.nextLine();
      System.out.print("Anna luvun maksimiarvo: ");
      int max = lukija.nextInt();
      lukija.nextLine();
      if (size > 0 && max > 0) {
         RandTable table = new RandTable(size, max);
         int number;
         do {
            number = table.nextNumber();
            if (number >= 0) {
               System.out.format("Satunnaislukutaulukosta: %d%n", number);
            }
         } while (number >= 0);
      }  
   }
}