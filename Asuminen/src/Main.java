import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        System.out.print("Anna tontin nimi: ");
        String nimi = scanner.nextLine();
        System.out.print("Anna tontin sijainnin leveyspiiri: ");
        String leveyspiiri = scanner.nextLine();
        System.out.print("Anna tontin sijainnin pituuspiiri: ");
        String pituuspiiri = scanner.nextLine();
        System.out.print("Anna tontin pinta-ala: ");
        double pinta_ala = scanner.nextDouble();
        Tontti tontti = new Tontti(nimi, leveyspiiri, pituuspiiri , pinta_ala);
        
        System.out.print("Anna rakennuksen huoneiden lukumäärä: ");
        int huoneiden_lkm = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Anna rakennuksen pinta-ala: ");
        double alaRakennus = scanner.nextDouble();
        scanner.nextLine();
        Rakennus rakennus = new Rakennus(alaRakennus, huoneiden_lkm);
        tontti.setRakennus(rakennus);

        System.out.print("Anna rakennuksen asukkaiden lukumäärä: ");
        int asukasLkm = scanner.nextInt();
        scanner.nextLine();
        Asukas[] asukkaat = new Asukas[asukasLkm];
        for (int index = 0; index < asukkaat.length; index++) {
            System.out.print("Anna asukkaan nimi: ");
            String nimiAsukas = scanner.nextLine();
            System.out.print("Anna asukkaan syntymäaika: ");
            String syntymaAika = scanner.nextLine();
            Asukas asukas = new Asukas(nimiAsukas, syntymaAika);
            asukkaat[index] = asukas;
            rakennus.setAsukkaat(asukkaat);
        }
        System.out.println(tontti.toString());
        scanner.close(); 
    }
}

