import java.util.List;

public class StoreView {
    private Store store;

    public StoreView(Store store) {
        this.store = store;
    }

    public void viewStoreProducts(){
        List<Product> listOfProductsInStore = new Store().showAllProducts();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%1s %10s %5s %10s %5s %10s %5s %10s %5s %10s %5s", "|", "PRODUCT'S NAME", "|", "QUANTITY","|", "DISCOUNTED","|", "VAT","|", "PRICE","|");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");
        for(Product product: listOfProductsInStore){
            System.out.format("%1s %14s %5s %10s %5s %10s %5s %10s %5s %10s %5s",
                    "|", product.getName(), "|", product.getQuantity(), "|", product.isDiscounted(), "|", product.getDiscountedPrice(), "|", product.getVAT(), "|", product.getPrice());
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }
    }

