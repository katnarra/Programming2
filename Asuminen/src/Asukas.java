public class Asukas {
    private String nimi;
    private String syntymaAika;

    public Asukas(final String nimi, final String syntymaAika) {
        this.nimi = nimi;
        this.syntymaAika = syntymaAika;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getSyntymaAika() {
        return syntymaAika;
    }

    public void setSyntymaAika(String syntymaAika) {
        this.syntymaAika = syntymaAika;
    }

    @Override
    public String toString() {
        return "Asukkaan nimi: " + nimi + ", syntymäaika: " + syntymaAika + ". ";
    }   
}