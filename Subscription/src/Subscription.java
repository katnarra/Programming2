public class Subscription {
    private String lehden_nimi;
    private String tilaajan_nimi;
    private String toimitusosoite;
    private double kuukausihinta;

    public Subscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double kuukausihinta) {
        this.lehden_nimi = lehden_nimi;
        this.tilaajan_nimi = tilaajan_nimi;
        this.toimitusosoite = toimitusosoite;
        setKuukausihinta(kuukausihinta);
    }

    public String getLehden_nimi() {
        return lehden_nimi;
    }

    public void setLehden_nimi(String lehden_nimi) {
        this.lehden_nimi = lehden_nimi;
    }

    public String getTilaajan_nimi() {
        return tilaajan_nimi;
    }

    public void setTilaajan_nimi(String tilaajan_nimi) {
        this.tilaajan_nimi = tilaajan_nimi;
    }

    public String getToimitusosoite() {
        return toimitusosoite;
    }

    public void setToimitusosoite(String toimitusosoite) {
        this.toimitusosoite = toimitusosoite;
    }

    public double getKuukausihinta() {
        return kuukausihinta;
    }

    public void setKuukausihinta(double kuukausihinta) {
        if (kuukausihinta > 0) {
        this.kuukausihinta = kuukausihinta;
        } else {
            System.out.println("Syöte ei kelpaa.");
        }
    }

    public String printInvoice() {
        return "Tilattavan lehden nimi: " +  lehden_nimi + ", kuukausihinta: " + kuukausihinta + " euroa.\n" + "Tilaajan nimi: "
                + tilaajan_nimi + ", toimitusosoite: " + toimitusosoite + ".\n";
    }
    
    
}