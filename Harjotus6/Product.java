public class Product {

    private String name;
    private double price;
    
    public Product(final String name_par, final double price_par){
        name = name_par;
        price = price_par;
    }
    
    public void setName( final String name_par){
        name = name_par;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setPrice(final double price_par){
        price = price_par;
    }
    
    public double getPrice(){
        return this.price;
    }
   
    @Override
    public String toString(){
        return "Tuote: " + this.name + " hinta: " + this.price;
   }
}