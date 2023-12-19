import java.util.Scanner;

public class Vt3main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        boolean bError = true;
        double kuukausihinta = 0.0;
        int tilauksen_kesto = 0;

        System.out.println("Tehdään ensin uuden lehden tilaus normaalitilauksella.");
        System.out.print("Anna tilattavan lehden nimi: ");
        String lehden_nimi = scanner.nextLine();
        System.out.print("Anna tilaajan nimi: ");
        String tilaaja = scanner.nextLine();
        System.out.print("Anna lehden toimitusosoite: ");
        String toimitusosoite = scanner.nextLine();
        do {
            try {
                System.out.print("Anna tilattavan lehden kuukausihinta: ");
                kuukausihinta = scanner.nextDouble();
                scanner.nextLine();

                bError = false;
            }
            catch (Exception e) {
                System.out.println("Tarkista syötteesi.");
                scanner.next();
            }
        } while (bError);
        bError = true;
        do {
            try {
                System.out.print("Anna tilauksen kesto kuukausina: ");
                tilauksen_kesto = scanner.nextInt(); 
                scanner.nextLine();
                
                bError = false;
            }
            catch (Exception e) {
                System.out.println("Tarkista syötteesi.");
                scanner.next();
            }
        } while (bError);

        

        RegularSubscription regSub = new RegularSubscription(lehden_nimi, tilaaja, toimitusosoite, kuukausihinta, tilauksen_kesto);
        printSubscriptionInvoice(regSub);

        bError = true;
        double kuukausihinta2 = 0.0;
        int alennusprosentti = 0;

        System.out.println("Tehdään sitten kestotilaus.");
        System.out.print("Anna tilattavan lehden nimi: ");
        String lehden_nimi2 = scanner.nextLine();
        System.out.print("Anna tilaajan nimi: ");
        String tilaaja2 = scanner.nextLine();
        System.out.print("Anna lehden toimitusosoite: ");
        String toimitusosoite2 = scanner.nextLine();
        do {
            try {
                System.out.print("Anna tilattavan lehden kuukausihinta: ");
                kuukausihinta2 = scanner.nextDouble();
                scanner.nextLine();

                bError = false;
            }
            catch (Exception e) {
                System.out.println("Tarkista syötteesi.");
                scanner.next();
                }
            } while (bError);

            bError = true;

            do {
                try {
                    System.out.print("Anna kestotilauksen alennusprosentti: ");
                    alennusprosentti = scanner.nextInt();
                    scanner.nextLine();
                    
                    bError = false;
                }
                catch (Exception e) {
                    System.out.println("Tarkista syötteesi.");
                    scanner.next();
                }
            } while (bError);
        
        StandingSubscription standSub = new StandingSubscription(lehden_nimi2, tilaaja2, toimitusosoite2, kuukausihinta2, alennusprosentti);
        printSubscriptionInvoice(standSub);
    }

    static void printSubscriptionInvoice(Subscription sub) {
        System.out.println(sub.printInvoice());
    }

        
    }

