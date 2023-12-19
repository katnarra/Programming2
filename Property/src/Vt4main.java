import java.util.Scanner;

public class Vt4main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        InsInfoContainer container = InsInfoContainer.getInstance();

        Property kiinteisto1 = new Property("Kerrostalo", "Oulu");
        InsuranceInfo insurance1 = new InsuranceInfo(kiinteisto1, 100000);
        container.addInsuranceInfo(insurance1);

        Property kiinteisto2 = new Property("Rivitalo", "Haukipudas");
        InsuranceInfo insurance2 = new InsuranceInfo(kiinteisto2, 200000);
        container.addInsuranceInfo(insurance2);

        Property kiinteisto3 = new Property("Omakotitalo", "Kempele");
        InsuranceInfo insurance3 = new InsuranceInfo(kiinteisto3, 300000);
        container.addInsuranceInfo(insurance3);

        Property kiinteisto4 = new Property("Paritalo", "Tyrnävä");
        InsuranceInfo insurance4 = new InsuranceInfo(kiinteisto4, 400000);
        container.addInsuranceInfo(insurance4);

        Property kiinteisto5 = new Property("Erillistalo", "Lumijoki");
        InsuranceInfo insurance5 = new InsuranceInfo(kiinteisto5, 500000);
        container.addInsuranceInfo(insurance5);

        container.printInsurance();

        System.out.print("Anna jokin arvo: ");
        double value = scanner.nextDouble();
        if (value > 0) {
            container.printSmallProperty(value);
            container.printBigProperty(value);
        } else {
            System.out.println("Annettu arvo ei kelpaa.");
        }

        scanner.close();
    }
}
