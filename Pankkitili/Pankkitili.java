package Pankkitili;
public class Pankkitili {

    private String tilinomistaja, tilinumero;
    private Double saldo = 0.0;


    public Pankkitili(String omistaja, String numero, Double tilinSaldo) {
        tilinomistaja = omistaja;
        tilinumero = numero;
        setSaldo(tilinSaldo);
    }

    @Override
    public String toString() {
        return "Pankkitilin omistaja: " + tilinomistaja + ", numero: " + tilinumero + ", saldo: " + saldo;
    }

    public String getTilinomistaja() {
        return tilinomistaja;
    }

    public void setTilinomistaja(String omistaja) {
        tilinomistaja = omistaja;
    }

    public String getTilinumero() {
        return tilinumero;
    }

    public void setTilinumero(String numero) {
        tilinumero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double tilinSaldo) {
        if (tilinSaldo > 0) {
        saldo = tilinSaldo;
        } else {
            System.out.println("Saldo ei kelpaa.");
        }
    }

    public void nostaTililta(Double summa) {
        if (saldo >= summa & summa >0) {
            saldo -= summa;
        } else {
            System.out.println("Tililtä ei voida nostaa kyseistä summaa.");
        }
    }

    public void talletaTilille(Double summa) {
        if (summa > 0) {
            saldo += summa;
        } else {
            System.out.println("Tilille ei voida tallettaa kyseistä summaa.");
        }
    }

}