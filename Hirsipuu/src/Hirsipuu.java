import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hirsipuu {
    
    private Sanalista sanalista;
    private int arvausten_lkm;
    private String arvattava_sana;
    private char[] sanan_kirjaimet; // sis. sanan muotona _ _ _ _ _
    private ArrayList<Character> arvaukset;
    
    public Hirsipuu(Sanalista sanalista, int arvausten_lkm) {
        this.sanalista = sanalista;
        this.arvausten_lkm = arvausten_lkm;
        //arvotaan annettu sana sanalistasta
        Random rand = new Random();
        List<String> lista = sanalista.annaSanat();
        int random_index = rand.nextInt(lista.size());
        String random_sana = lista.get(random_index);
        arvattava_sana = random_sana;

        ArrayList<Character> arvaukset = new ArrayList<>();
        this.arvaukset = arvaukset;
        alusta_kirjaimet(arvattava_sana);
    }

    public void alusta_kirjaimet(String sana) {
        // tekee sanasta muotoa _ _ _ _ _
        sanan_kirjaimet = new char[sana.length()];
        for (int i = 0; i < sana.length(); i++) {
            sanan_kirjaimet[i] = '_';
        }
    } 

    public char[] getSanan_kirjaimet() {
        return sanan_kirjaimet;
    }

    public void setSanan_kirjaimet(char[] sanan_kirjaimet) {
        this.sanan_kirjaimet = sanan_kirjaimet;
    }

    public List<Character> arvaukset() {
        return arvaukset;
    }

    public void setArvaukset(ArrayList<Character> arvaukset) {
        this.arvaukset = arvaukset;
    }
    
    public int arvauksiaOnJaljella() {
        return arvausten_lkm;
    }

    public void setArvausten_lkm(int arvausten_lkm) {
        this.arvausten_lkm = arvausten_lkm;
    }

    public String sana() {
        return arvattava_sana;
    }

    public void setArvattava_sana(String arvattava_sana) {
        this.arvattava_sana = arvattava_sana;
    }

    public Sanalista getSanalista() {
        return sanalista;
    }

    public void setSanalista(Sanalista sanalista) {
        this.sanalista = sanalista;
    }

    public boolean arvaa(Character merkki) {
        if (!arvaukset.contains(merkki)) {
            arvaukset.add(merkki);
        } else {
            System.out.println("Merkki on jo käytetty.");
        }
        
        int index = arvattava_sana.indexOf(merkki);
        if (index >= 0) {
            sanan_kirjaimet[index] = merkki;
            System.out.println(sanan_kirjaimet); 
            while (index>=0) {
                index = arvattava_sana.indexOf(merkki, index+1);
                if (index > 0) {
                    sanan_kirjaimet[index] = merkki;
                    System.out.println(sanan_kirjaimet);
                }
        } 
        return true;       
        } else {
            System.out.println("Väärä arvaus.");
            arvausten_lkm--;
            System.out.println("Arvauksia jäljellä: " +arvausten_lkm);
            System.out.println(sanan_kirjaimet);
            return false;
        }
        
    }

    public boolean onLoppu() {
        String sana = String.valueOf(sanan_kirjaimet);
        if (!sana.contains("_")) {
            return true;
        } else {
            return false;
        }
    }
}
