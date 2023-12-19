public class Tontti {
    private String nimi;
    private String osoite;
    private double pinta_ala;
    private Rakennus rakennus;

    public Tontti(String nimi, String osoite, double pinta_ala, Rakennus rakennus) {
        this.nimi = nimi;
        this.osoite = osoite;
        setPinta_ala(pinta_ala);
        this.rakennus = rakennus;
    }       

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public double getPinta_ala() {
        return pinta_ala;
    }

    public void setPinta_ala(double pinta_ala) {
        if (pinta_ala > 0) {
            this.pinta_ala = pinta_ala;
        } else {
            System.out.println("Syötetty pinta-ala ei kelpaa.");
        }
    }

    public Rakennus getRakennus() {
        return rakennus;
    }

    public void setRakennus(Rakennus rakennus) {
        this.rakennus = rakennus;
    }

    @Override
    public String toString() {
        return "Tontin nimi: " + nimi + ", osoite: " + osoite +", pinta-ala: " + pinta_ala +  ". " + rakennus;
    }
}