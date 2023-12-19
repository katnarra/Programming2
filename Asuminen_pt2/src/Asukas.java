public class Asukas {
    
    private String nimi;

    public Asukas(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String toString() {
        return "Asukkaan nimi: " + nimi + ". ";
    }   
}