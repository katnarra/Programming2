import java.util.*;

class ProductRepository {
	
    //https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html
    private Vector<Product> container;
    
    public ProductRepository(){
    	/* Huomaa konstruktori, oletuksena tilaa varataan kolmelle elementille ja 
    	 * kokoa kasvatetaan (tarvittaessa) yhdellä
    	 * 
    	 * Note the constructor, by default, there is memory reserved for three elements and 
    	 * the size is increased by one (when necessary)
    	 */
        container = new Vector<>(3,1);
    }
    
    public void addProduct(Product prod){
        container.addElement(prod);
    }
    
    public Product removeLast(){
        
    	/* Tutki, onko vektoriin talletettu elementtejä.
    	 * Testi if there are any elements stored in the vector, yet.
    	 */
        if (!container.isEmpty()){
        	
            Product prod;
            
            /* 
             * Palauttaa vektorin viimeisimmän elementin.
             * Returns the last element of the vector.
             */
            prod = container.lastElement();
            
            /* Palauttaa parametrina annetun elementin viimeisimmän esiintymän indeksin 
             * tässä vektorissa, tai -1 (mikäli annettua elementtiä ei löydy tästä vektorista).
             * 
             * Returns the index of the last occurrence of the specified element in this 
             * vector, or -1 (if this vector does not contain the given element).
             */
            int i = container.lastIndexOf(prod);
            
            /* Poistaa kyseisessä indeksissä olevan elementin (tutki, mitä tapahtuu, 
             * jos indeksi on esimerkiksi negatiivinen...).
             * 
             * Deletes the component at the specified index (check what would happen, 
             * if the index was negative...).
             */
            container.removeElementAt(i);
            
            return prod;
        }
        
        /*
         * Vektori on tyhjä!
         * Vector is empty!
         */
        return null;        
    }
    
    public void display(){
        
    	/* https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
    	 * https://www.tutorialspoint.com/java/java_using_iterator.htm
    	 * 
    	 * Palauttaa kokoelman läpikäyntiin soveltuvan iteraattorin.
    	 * Returns an iterator over the elements in this list in proper sequence.
    	 */
        Iterator<Product> iter = container.iterator();
        
        /* 
         * Palauttaa totuusarvon true, jos elementtejä on vielä jäljellä, muuten false.
         * Huomaa, ettei metodi palauta itse oliota.
         * 
         * Returns true if there are more elements left, otherwise returns false. 
         * Note - does not retrieve the object itself.
         */
        while (iter.hasNext()){
        	
        	/* Palauttaa seuraavan elementin.
        	 * Returns the next element.
        	 */
            System.out.println(iter.next());
        }        
    }
}