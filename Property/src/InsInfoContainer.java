import java.util.ArrayList;
import java.util.List;

public class InsInfoContainer {

    private List<InsuranceInfo> info;

    private static InsInfoContainer singleInstance;

    public static InsInfoContainer getInstance() {
        if (null == singleInstance) {
            singleInstance = new InsInfoContainer();
        } 
        return singleInstance;
    }

    public InsInfoContainer() {
        info = new ArrayList<>();
    }


    public void addInsuranceInfo(InsuranceInfo insInfo) {
        info.add(insInfo);
    }

    public void printInsurance() {
        for (InsuranceInfo insInfo : info) {
            System.out.println(insInfo);
        }
    }

    public void printBigProperty(double value) { 
        System.out.println("Kiinteistöt, joiden vakuutusarvo on annettua arvoa " + value + " suurempi:");
        for (InsuranceInfo insInfo : info) {
            double ins_value = insInfo.getInsurance_value();
            if (ins_value > value) {
                System.out.println(insInfo);
            }
        }
        
    }

    public void printSmallProperty(double value) {
        System.out.println("Kiinteistöt, joiden vakuutusarvo on annettua arvoa " + value + " pienempi:");
        for (InsuranceInfo insInfo : info) {
            double ins_value = insInfo.getInsurance_value();
            if (ins_value < value) {
                System.out.println(insInfo);
            }
        }
    }
}
