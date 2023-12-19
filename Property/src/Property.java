public class Property {

    private String property_type;
    private String location;

    public Property(String property_type, String location) {
        this.property_type = property_type;
        this.location = location;
    }
    public String getProperty_type() {
        return property_type;
    }
    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Property location: " + location + ", property type: " + property_type + ". ";
    }


    
}
