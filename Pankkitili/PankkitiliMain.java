package Pankkitili;
import java.util.Scanner;

public class PankkitiliMain {
    public static void main(String[] args ) {
        
        System.out.print("Syötä tilinomistaja: ");
        Scanner scanner = new Scanner(System.in);
        String tilinomistaja = scanner.nextLine();
        System.out.print("Syötä tilinumero: ");
        String tilinumero = scanner.nextLine();
        System.out.print("Syötä saldo: ");
        Double saldo = scanner.nextDouble();
        Pankkitili tili = new Pankkitili(tilinomistaja, tilinumero, saldo);
        System.out.println(tili.toString());

        System.out.print("Syötä nostettava summa: ");
        Double nosto = scanner.nextDouble();
        tili.nostaTililta(nosto);
        System.out.println(tili.toString());

        System.out.print("Syötä talletettava summa: ");
        Double summa = scanner.nextDouble();
        tili.talletaTilille(summa);
        System.out.println(tili.toString());

        scanner.close();

    }
}

