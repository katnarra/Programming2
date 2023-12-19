import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Sanalista {
    
    private ArrayList<String> sanalista;
    private String tiedoston_nimi;

    public Sanalista(String tiedoston_nimi) {
        this.tiedoston_nimi = tiedoston_nimi;
        //annaSanat();
        try (BufferedReader br = new BufferedReader(new FileReader(tiedoston_nimi))) {
            sanalista = new ArrayList<>();
            if (sanalista != null) {
               sanalista.clear(); 
            }
            String rivi;
            while ((rivi=br.readLine()) != null) {
                sanalista.add(rivi);  
            }
        } catch (FileNotFoundException e) {
        System.out.println("Failed to open file for writing: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Failed to open file for writing: " + e.getMessage());;
        }
    }

    public List<String> annaSanat() {
        return sanalista;
    }

    public void setSanalista(ArrayList<String> sanalista) {
        this.sanalista = sanalista;
    }

    public String getTiedoston_nimi() {
        return tiedoston_nimi;
    }

    public void setTiedoston_nimi(String tiedoston_nimi) {
        this.tiedoston_nimi = tiedoston_nimi;
    }
}




