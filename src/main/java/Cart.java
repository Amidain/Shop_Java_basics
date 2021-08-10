import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> productList;

    public Cart() {
        productList = new ArrayList<Product>();
        productList.addAll(List.of(new Product("Carrot", 2.49, false, 2.49, 5, 3 ),
                new Product("Potato", 1.89, false, 1.89, 5, 12 ),
                new Product("Onion", 0.99, true, 0.69, 5, 2 ),
                new Product("Beetroot", 3.59, false,3.59, 5, 1 ),
                new Product("Cabbage", 4.00, true, 2.00, 5, 1 ),
                new Product("Cauliflower", 3.50, true, 1.99, 5, 4),
                new Product("Camote", 12.49, true, 9.89, 5, 6),
                new Product("Broccoli", 5.49, false, 5.49, 5, 1),
                new Product("Tomato", 8.49, false, 8.49, 5, 3),
                new Product("Lettuce", 2.25, true, 0.99, 5, 2)));

    }

    public void addProductToCart(Product product){
        if(product == null) {
            throw new IllegalArgumentException("Product cannot be null!");
        } else if(!(new Store().showAllProducts().contains(product))){
            throw new IllegalArgumentException("Product is not available at the shop!");
        }
        productList.add(product);
    }

    public List<Product> showAllProductsInCart (){
        return productList;
    }

    public void removeProductFromCart(Product product) {
        if (product == null){
            throw new IllegalArgumentException("Product cannot be null");
        } else if(!(productList.contains(product))){
            throw new IllegalArgumentException("Product was not added to the cart!");
        }
        productList.remove(product);
    }

    public double getTotalPrice (String productName) {
        double totalPrice = 0;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(productName)) {
                if (productList.get(i).isDiscounted() == true) {
                    totalPrice += (productList.get(i).getDiscountedPrice() * productList.get(i).getQuantity());
                } else {
                    totalPrice += (productList.get(i).getPrice() * productList.get(i).getQuantity());
                }
            }
        }
        return totalPrice;
    }

     public void printCart () {
         System.out.println("--------------------------------------------------------");
         System.out.printf("%1s %10s %5s %10s %5s %10s %5s", "|", "PRODUCT'S NAME", "|", "QUANTITY", "|", "PRICE", "|");
         System.out.println();
         System.out.println("--------------------------------------------------------");
         for (Product product : productList) {
             if (product.isDiscounted() == true) {
                 System.out.printf("%1s %14s %5s %10s %5s %10s %5s", "|", product.getName(), "|", product.getQuantity(), "|", product.getDiscountedPrice(), "|");
                 System.out.println();
             } else {
                 System.out.printf("%1s %14s %5s %10s %5s %10s %5s", "|", product.getName(), "|", product.getQuantity(), "|", product.getPrice(), "|");
                 System.out.println();
             }
         }
         System.out.println("--------------------------------------------------------");
     }

}
