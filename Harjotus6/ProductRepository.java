import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    
    private List<Product> sailio;

    private static ProductRepository singleInstance;

    public static ProductRepository getInstance() {
        if (null == singleInstance) {
            singleInstance = new ProductRepository();
        } 
        return singleInstance;
    }

    private ProductRepository() {
        sailio = new ArrayList<>();
    }

    public void add(Product product) {
        sailio.add(product);
    }

    public Product removeLast() {
        if (!sailio.isEmpty()) {
            Product product = sailio.get(sailio.size()-1);
            sailio.remove(sailio.size()-1);
            return product;
        }
        return null;
    }

    public void printProducts() {
        for (Product product : sailio) {
            System.out.println(product);
        }
    }
}
