package Harjoitus_3.T1;
import java.util.Scanner;

public class ProductMain {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Tervetuloa tuotetietojen maailmaan!");
        
        System.out.print("Montako tuotetta haluat syöttää?: ");
        int countOfProducts = scanner.nextInt();
        scanner.nextLine();
        Product[] products = new Product[countOfProducts];
        readProducts(products);
        print(products);
        scanner.close();
    }

    static void print(Product[] products) {
        for(Product product : products) {
            print(product);
        }
    }

    static void print(final Product product) {
        System.out.format("Tuote: %s, hinta: %.2f%n", product.getName(), product.getPrice());
    }

    static void readProducts(Product[] products) {
        for (int index = 0; index < products.length; index++) {
            products[index] = readProduct();
        }
    }

    static Product readProduct() {
        System.out.print("Anna tuotteen nimi: ");
        String name = scanner.nextLine();
        System.out.print("Anna tuotteen hinta: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        Product product = new Product(name, price);
        return product;
    }

    public static void printProducts( Product [] products ){
      
        System.out.println("\nTaulukokon sisaltö:");
        for( Product p: products)
        //for(int i=0; i < products.length; i++){
           //printProduct(products[i]);
           printProduct( p );
        //}      
     }
}
