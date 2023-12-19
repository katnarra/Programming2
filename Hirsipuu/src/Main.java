import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Pelataan hirsipuuta!");
        System.out.print("Anna sanatiedoston nimi: ");
        Scanner scanner = new Scanner(System.in);
        String tiedosto = scanner.nextLine();
        Sanalista sanalista = new Sanalista(tiedosto);
        Hirsipuu hirsipuu = new Hirsipuu(sanalista, 12);

        int arvausten_lkm = hirsipuu.arvauksiaOnJaljella();
        while (arvausten_lkm > 0) {
            System.out.print("Syötä seuraava arvaus: ");
            String kirjain = scanner.nextLine().toLowerCase();
            Character merkki = kirjain.charAt(0);
            hirsipuu.arvaa(merkki);
            if (hirsipuu.onLoppu()) {
                System.out.println("Voitit pelin.");
                break;
            }
        }
        scanner.close();
    }
}
