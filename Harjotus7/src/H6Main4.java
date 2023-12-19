import java.util.InputMismatchException;
import java.util.Scanner;

/*
	1. tekstitiedosto -- enkoodaus älöäöeu -- utf-8
	2. rakenteellinen tekstitiedosto -- löytyykö joku toteutus jo tälle?
	-asetukset: properties
	-comma separated values csv
	- tab separated values tsv
	3. rakenteellinen tekstitiedosto -- 250N, XML
	4. binääriset tiedostot / stream: java serializable, google protobuf
	5. tietokanta: SQL, noSQL
*/

public class H6Main4 {

	public static final Scanner sc = new Scanner(System.in);

	public static void main(String [] args){

		ProductRepoSingleton container = ProductRepoSingleton.getInstance();
		int choice = 0;
		Product prod;
		
		do{
			displayMenu ();
			choice = readInt();

			switch ( choice ){
			case 1:

				prod = readProduct();
				container.addProduct(new Product(prod));
				break;

			case 2:

				if ((prod = container.removeLast()) != null){
					System.out.print("The product \"" + prod.getName() + "\" has been removed from the repository.");
				}else{
					System.out.println("The repository is empty!");
				}
				break;

			case 3:
				/* Testataan, että molemmissa repoissa on sama sisältö.
				 * Huomaa, että addProduct metodia on kutsuttu vain container-viitemuuttujalle.
				 *  
				 * Testing that both repositories will have the same content.
				 * Note that the method addProduct has only been called on the container reference variable.
				 */
				ProductRepoSingleton repo = ProductRepoSingleton.getInstance();
				System.out.println("*** Local repo: ");
				repo.display();
				System.out.println("*** Program repo: ");
				container.display();
				break;

			case 4:
				boolean success = ProductRepoSingleton.getInstance().tallennaTiedostoon("tuotteet.dat");
				if (!success) {
					System.out.println("Failed to save the products!");
				}
				break;
			
			case 5: 
				boolean success1 = ProductRepoSingleton.getInstance().lueTiedostosta("tuotteet.dat");
				if (!success1) {
					System.out.println("Failed to save the products!");
				}
				break;

			case 0:
				System.out.print("End of the program.");
				break;

			default:
				System.out.print("Wrong choice, try again.");
			}

		}while ( choice != 0);
	}

	public static void displayMenu() {
		System.out.println("\n Your choice...");
		System.out.println("\n 1) Add product to the end of the repository");
		System.out.println(" 2) Remove product from the end of the repository");
		System.out.println(" 3) Display the contents of the repository");
		System.out.println(" 4) Save repository to file");
		System.out.println(" 0) End");		
	}

	public static int readInt() {

		boolean ok = false;
		int value = 0;

		/* käyttäjän tulee syöttää kokonaisluku (tarvittaessa uudelleen)
		 * A user has to enter an integer (again, if necessary)
		 */
		do {
			/* Oletettu toiminnallisuus sisällytetään try-lohkoon = käyttäjä on syöttänyt kokonaisluvun
			 * The expected functionality is incldued in the try-block = a user has entered an integer
			 *  
			 */
			try {
				value = sc.nextInt();
				sc.nextLine();
				ok = true;
				/* Catch-lohkossa otetaan kiinni mahdollinen poikkeus InputMismatchException. Tämä siis suoritetaan
				 * vain, mikäli käyttäjä ei ole syöttänyt kokonaislukua. Sama alla reaaliluvulle (readDouble).
				 * 
				 *  The possible exception InputMismatchException is caught in the catch-block. This will be executed
				 *  only if the user has not entered an integer. Below the same for the real value (readDouble).
				 */
			} catch (InputMismatchException ime) {
				sc.nextLine();
				System.out.print("Error, try again > ");
			}
		} while (!ok);
		return value;
	}

	public static double readDouble() {

		boolean ok = false;
		double value = 0.0;

		do {
			try {
				value = sc.nextDouble();
				sc.nextLine();
				ok = true;
			} catch (InputMismatchException ime) {
				sc.nextLine();
				System.out.print("Error, try again > ");
			}
		} while (!ok);
		return value;
	}

	public static Product readProduct(){
		String name;
		double price = 0.0;

		System.out.print("Give the product name > ");
		name = sc.nextLine();

		System.out.print("Give the price for \"" + name + "\" > ");

		do {
			price = readDouble();
		} while (price <= 0);

		Product prod = new Product(name, price);
		return prod;
	}
}