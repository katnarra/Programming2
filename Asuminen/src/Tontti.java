public class Tontti {
    private String nimi;
    private String leveyspiiri;
    private String pituuspiiri;
    private double pinta_ala;
    private Rakennus rakennus;

    public Tontti(final String nimi, final String leveyspiiri, final String pituuspiiri, final double pinta_ala) {
        this.nimi = nimi;
        this.leveyspiiri = leveyspiiri;
        this.pituuspiiri = pituuspiiri;
        setPinta_ala(pinta_ala);
    }       

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getLeveyspiiri() {
        return leveyspiiri;
    }

    public void setLeveyspiiri(String leveyspiiri) {
        this.leveyspiiri = leveyspiiri;
    }

    public String getPituuspiiri() {
        return pituuspiiri;
    }

    public void setPituuspiiri(String pituuspiiri) {
        this.pituuspiiri = pituuspiiri;
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
        return "Tontin nimi: " + nimi + ", pinta-ala: " + pinta_ala + ", sijainti: " + leveyspiiri + ", " + pituuspiiri + ". " + rakennus;
    }
}