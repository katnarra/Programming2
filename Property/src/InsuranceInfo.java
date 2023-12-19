public class InsuranceInfo {

    private Property property;
    private double insurance_value;
    
    public InsuranceInfo(Property property, double insurance_value) {
        this.property = property;
        this.insurance_value = insurance_value;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public double getInsurance_value() {
        return insurance_value;
    }

    public void setInsurance_value(double insurance_value) {
        this.insurance_value = insurance_value;
    }

    @Override
    public String toString() {
        return property + "Insurance value: " + insurance_value;
    }

    
    
    
}
