import java.util.Iterator;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

public class H6_Main {

   private static Scanner sc = new Scanner(System.in);
   
   public static void main(String [] args){
      
      ProductRepository sailio = ProductRepository.getInstance();
      int valinta = 0;
      double hinta  = 0;
      String syote;
      
      do{
         tulostaValikko ();
         valinta = lueInt();
         
         
         switch ( valinta ){
            case 1:
               System.out.print("Anna tuotteen nimi: ");
               syote = sc.nextLine();
               System.out.print("Anna hinta euroina->");
               hinta = lueDouble();
               sailio.add(new Product(syote, hinta));
               break;
               
            case 2:
               Product removed = sailio.removeLast();
               if(null != removed){ // ! on not empty
                  System.out.print("Hinta " + removed +" on poistettu säiliosta");
               }else{
                  System.out.println("Säilio on tyhja!");
               }
               break;
               
            case 3:
               sailio.printProducts();
               break;
               
            case 0:
               System.out.println("Ohjelman suoritus päättyy.");
               break;
               
            default:
               System.out.println("Väärä valinta. Yritä uudelleen.");
         }
         
      }while ( valinta != 0);

      sc.close();
   }
   
   public static void tulostaSailio(final List<Product> sailio ){
      
      Iterator<Product> iter = sailio.iterator();
      
      while( iter.hasNext()){
         System.out.println(iter.next());
      }
      
      
   }
   public static void tulostaValikko() {
      System.out.println("\n\n 1) Lisää tuote säilion loppuun");
      System.out.println(" 2) Poista tuote säilion lopusta");
      System.out.println(" 3) Tulosta säilion sisältö");
      System.out.println(" 0) Lopeta");
      System.out.print("\nValintasi > ");
   }
   
   public static int lueInt(){
      boolean ok = false;
      int luku = 0;
      
      do {
         
         try {
            luku = sc.nextInt();
            sc.nextLine();
            ok = true;
         }catch( InputMismatchException ime ){
            sc.nextLine();
            System.out.print("Virhe, yrita uudelleen > ");
         }
         
      }while(!ok);
      
      return luku;
      
   }
   
   public static double lueDouble(){
      boolean ok = false;
      double luku = 0.0;
      
      do {
         
         try {
            luku = sc.nextDouble();
            sc.nextLine();
            ok = true;
         }catch( InputMismatchException ime ){
            sc.nextLine();
            System.out.print("Virhe, yrita uudelleen > ");
         }
         
      }while(!ok);
      
      return luku;
      
      
   }

   
}
