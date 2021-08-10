import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> listOfProducts;

    public Store() {
        listOfProducts = new ArrayList<Product>();
        listOfProducts.addAll(List.of(new Product("Carrot", 2.49, false, 2.49, 5, 200 ),
                new Product("Potato", 1.89, false, 1.89, 5, 123 ),
                new Product("Onion", 0.99, true, 0.69, 5, 76 ),
                new Product("Beetroot", 3.59, false,3.59, 5, 32 ),
                new Product("Cabbage", 4.00, true, 2.00, 5, 12 ),
                new Product("Cauliflower", 3.50, true, 1.99, 5, 9),
                new Product("Camote", 12.49, true, 9.89, 5, 54),
                new Product("Broccoli", 5.49, false, 5.49, 5, 23),
                new Product("Tomato", 8.49, false, 8.49, 5, 87),
                new Product("Lettuce", 2.25, true, 0.99, 5, 44)));
    }

    public void addProduct(Product product){
        if (product == null){
            throw new IllegalArgumentException("Product cannot be null!");
        }
        listOfProducts.add(product);
    }

    public List<Product> showAllProducts (){
        return listOfProducts;
        }

    public void removeProduct(Product product){
        if (product == null){
            throw new IllegalArgumentException("Product cannot be null!");
        }
        listOfProducts.remove(product);
    }

    public int getProductQuantity (String productName){
        for (int i = 0; i < listOfProducts.size(); i++) {
            if(listOfProducts.get(i).getName().equals(productName)){
                return listOfProducts.get(i).getQuantity();
            }
        }
        throw new IllegalArgumentException("Product is not available at the store");
    }

}
