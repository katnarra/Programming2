import java.io.Serializable;

import java.io.Serializable;

public class Product implements Serializable {


    private static final long serialVersionUID = 42L;

    private String name;
    private double price;
    private transient int tuoteTunniste;
    
    // Constuctor
    public Product(final String name_par, final double price_par){
        this.name = name_par;
        this.price = price_par;
        tuoteTunniste = hashCode();
    }
    
    // Copy constructor - note values are given as String and double for the constructor
    public Product(final Product anotherProde){
        this(anotherProde.name, anotherProde.price);
    }
    
    public void setName( final String name_par){
        this.name = name_par;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setPrice(final double price_par){
        this.price = price_par;
    }
    
    public double getPrice(){
        return this.price;
    }
   
   public String toString(){
      return "Product \"" + this.name + "\", price: " + this.price;
   }
}