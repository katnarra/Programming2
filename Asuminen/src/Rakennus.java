public class Rakennus {
    private double pinta_ala;
    private int huoneiden_lkm;
    private Asukas[] asukkaat;


    public Rakennus(double pinta_ala, int huoneiden_lkm) {
        setPinta_ala(pinta_ala);
        this.huoneiden_lkm = huoneiden_lkm;
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
        this.huoneiden_lkm = huoneiden_lkm;
    }

    public Asukas[] getAsukkaat() {
        return asukkaat;
    }

    public void setAsukkaat(Asukas[] asukkaat) {
        this.asukkaat = asukkaat;
    }

    @Override
    public String toString() {
        String s = "Rakennuksen huoneiden lukumäärä: " + huoneiden_lkm + ", pinta-ala: " + pinta_ala + ". ";
        for (int index = 0; index < asukkaat.length; index++) {
            s += asukkaat[index];
        }
        return s;
    }
}