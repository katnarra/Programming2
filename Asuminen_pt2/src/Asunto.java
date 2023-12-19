import java.util.ArrayList;
import java.util.List;

public class Asunto {
    private double pinta_ala;
    private int huoneiden_lkm;
    private Asukas asukas;
    private List<Asukas> asukkaat;

    public Asunto(double pinta_ala, int huoneiden_lkm, Asukas asukas) {
        setPinta_ala(pinta_ala);
        setHuoneiden_lkm(huoneiden_lkm);
        this.asukas = asukas;
        asukkaat = new ArrayList<>();
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

    public int getHuoneiden_lkm() {
        return huoneiden_lkm;
    }

    public void setHuoneiden_lkm(int huoneiden_lkm) {
        if (huoneiden_lkm >= 0) {
            this.huoneiden_lkm = huoneiden_lkm;
        } else {
            System.out.println("Syötetty lukumäärä ei kelpaa.");
        }
        
    }

    public Asukas getAsukas() {
        return asukas;
    }

    public void setAsukas(Asukas asukas) {
        this.asukas = asukas;
    }
    
    public List<Asukas> getAsukkaat() {
        return asukkaat;
    }

    public void setAsukkaat(List<Asukas> asukkaat) {
        this.asukkaat = asukkaat;
    }

    public void addAsukas(Asukas asukas) {
        asukkaat.add(asukas);
    }

    @Override
    public String toString() {
        String s = "Asunnon pinta-ala: " + pinta_ala + ", huoneiden lukumäärä: " + huoneiden_lkm + ". ";
        for (Asukas asukas : asukkaat) {
            s += asukas.toString();
        }
        return s;
    }
    

    
}
