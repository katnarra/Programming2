import java.util.ArrayList;
import java.util.List;

public class Rakennus {
    private int asuntojen_lkm;
    private Asunto asunto;
    private List<Asunto> sailio;
    private String tyyppi;

    protected Rakennus(int asuntojen_lkm, Asunto asunto, String tyyppi) {
        this.asuntojen_lkm = asuntojen_lkm;
        this.asunto = asunto;
        sailio = new ArrayList<>();
        this.tyyppi = tyyppi;
    }

    public int getAsuntojen_lkm() {
        return asuntojen_lkm;
    }

    public void setAsuntojen_lkm(int asuntojen_lkm) {
        this.asuntojen_lkm = asuntojen_lkm;
    }  

    public Asunto getAsunto() {
        return asunto;
    }

    public void setAsunto(Asunto asunto) {
        this.asunto = asunto;
    }

    public void addAsunto(Asunto asunto) {
        sailio.add(asunto);
    }

    public List<Asunto> getSailio() {
        return sailio;
    }

    public void setSailio(List<Asunto> sailio) {
        this.sailio = sailio;
    }

    public String getTyyppi() {
        return tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    @Override
    public String toString() {
        String s = "Rakennuksen tyyppi: " + tyyppi + ", asuntojen lukumäärä: " + asuntojen_lkm + ". ";
        for (Asunto asunto : sailio) {
            s += asunto.toString();
        }
        return s;
    }
}