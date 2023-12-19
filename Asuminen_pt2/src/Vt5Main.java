import java.util.Scanner;

public class Vt5Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        System.out.print("Anna tontin nimi: ");
        String tontti_nimi = scanner.nextLine();
        System.out.print("Anna tontin osoite: ");
        String tontti_osoite = scanner.nextLine();
        boolean error = true;
        double tontti_ala = 0;
        do {
            try {
                System.out.print("Anna tontin pinta-ala: ");
                tontti_ala = scanner.nextDouble();
                scanner.nextLine();
                if (tontti_ala > 0) {
                    error = false;
                } else {
                    System.out.println("Syötetty pinta-ala ei voi olla negatiivinen.");
                }
            } catch (Exception e) {
                System.out.println("Syötetty pinta-ala ei kelpaa.");
                scanner.next();
            }
        } while (error);
        
        
        Rakennus r = setType();
        Tontti tontti = new Tontti(tontti_nimi, tontti_osoite, tontti_ala, r);
        

        int asuntojen_lkm = r.getAsuntojen_lkm();
        for (int x = 0; x < asuntojen_lkm; x++) {
            Asunto asunto = asunto_tiedot();
            r.addAsunto(asunto);
            annaKoti(asunto);
        }
        scanner.close();

        System.out.println(tontti.toString());

    }

    public static Rakennus setType() {
        System.out.print("Valitse tontin rakennuksen tyyppi: ");
        String rakennus_tyyppi = scanner.nextLine();
        Rakennus r = null;
        switch (rakennus_tyyppi.toLowerCase()) {
            case "kerrostalo":
                r = kysy_tiedot(rakennus_tyyppi);
                break;
            case "omakotitalo":
                Asunto asunto = null;
                int asuntojen_lkm = 1;
                String tyyppi = "Omakotitalo";
                r = new Omakotitalo(asuntojen_lkm, asunto, tyyppi);
                break;
            case "rivitalo":
                r = kysy_tiedot(rakennus_tyyppi);
                break;
        }
        return r;
    }

    public static Asunto asunto_tiedot() {
        boolean error = true;
        double asunto_ala = 0;
        do {
            try {
                System.out.print("Anna asunnon pinta-ala: ");
                asunto_ala = scanner.nextDouble();
                scanner.nextLine();
                if (asunto_ala <= 0) {
                    System.out.println("Syötetty pinta-ala ei kelpaa.");
                } else {
                    error = false;
                }
            } catch (Exception e) {
                System.out.println("Syötetty pinta-ala ei kelpaa.");
                scanner.next();
            }
        } while (error);
        error = true;
        int huone_lkm = 0;
        do {
            try {
                System.out.print("Anna asunnon huoneiden lukumäärä: ");
                huone_lkm = scanner.nextInt();
                scanner.nextLine();
                if (huone_lkm > 0) {
                    error = false;
                } else {
                    System.out.println("Syötetty lukumäärä ei voi olla negatiivinen.");
                }
            } 
            catch (Exception e) {
                System.out.println("Syötetty lukumäärä ei kelpaa.");
                scanner.next();
            }
        } while (error);
        
        Asukas asukas = null;
        Asunto asunto = new Asunto(asunto_ala, huone_lkm, asukas);
        return asunto;
    }


    public static Rakennus kysy_tiedot(String tyyppi) {
        boolean error = true;
        int asuntojen_lkm = 0;
        do {
            try {
                System.out.print("Anna rakennuksen asuntojen määrä: ");
                asuntojen_lkm = scanner.nextInt();
                scanner.nextLine();
                if (asuntojen_lkm > 0) {
                    error = false;
                } else {
                    System.out.println("Syötetty lukumäärä ei voi olla negatiivinen.");
                }
            } catch (Exception e) {
                System.out.println("Syötetty lukumäärä ei kelpaa.");
                scanner.next();
            }

        } while (error);

        if (tyyppi.toLowerCase() == "rivitalo") {
            String tyyppi_r = "Rivitalo";
            Asunto asunto_r = null;
            return new Rivitalo(asuntojen_lkm, asunto_r, tyyppi_r);
        } else {
            String tyyppi_k = "Kerrostalo";
            Asunto asunto_k = null;
            return new Kerrostalo(asuntojen_lkm, asunto_k, tyyppi_k);
        }
    }

    public static void annaKoti(Asunto asunto) {
        boolean error = true;
        do {
            System.out.print("Anna asunnon asukkaan nimi: ");
            String asukas_nimi = scanner.nextLine();
            if (asukas_nimi.length() == 0) {
                error = false;
            } else {
                Asukas asukas = new Asukas(asukas_nimi);
                asunto.addAsukas(asukas);
            }
        } while (error);
    }
}
