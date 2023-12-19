package Harjoitus_3.T1;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;

public class H3T1_Main {
   
   private static Scanner lukija = new Scanner(System.in).useLocale( new Locale("us", "US") ); //windows saattaa muuten vaatia desimaalipisteen sijaan desimaalipilkkua

   public static void main( String [] args ){
      double price = 45.4;
      Product auto = new Product("Lada", price);
      ProductInfo autoInfo = new ProductInfo(auto, "Vintage Lada huonossa kunnossa");
      price = -100000.90;
      autoInfo.print();
      auto.setName("Mercedes Benz");
      autoInfo.print();

      ProductInfo lentokone = new ProductInfo("747", 3636346.21, "Iso jumbojetti");
      lentokone.print();
      
   }

   //private static Product readProduct() {
      // kysytään tietoja käyttäjältä
   //}



}