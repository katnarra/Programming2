public class ProductInfo {

   //attribuutit
   private Product product;
   private String info;

   //konstruktorit eli muodostimet
   public ProductInfo(final Product product, final String info) {
      this.product = product;
      this.info = info;
   }

   public ProductInfo(final String name, final double price, final String info) {
      this.product = new Product(name, price);
      this.info  = info;
   }
   //metodit

   public Product getProduct() {
       return product;
   }

   public void setProduct(Product product) {
       this.product = product;
   }

   public String getInfo() {
       return info;
   }

   public void setInfo(String info) {
       this.info = info;
   }

   public void print() {
      System.out.format("Tuote: %s hinta: %.2f%n --> seloste: %s%n",
                        product.getName(), product.getPrice(), info);
   }
  
}
