import java.util.Collection;
import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private boolean isDiscounted;
    private double discountedPrice;
    private int VAT;
    private int quantity;

    public Product() {
    }

    public Product(String name, double price, boolean isDiscounted, double discountedPrice, int VAT, int quantity) {
        this.name = name;
        this.price = price;
        this.isDiscounted = isDiscounted;
        this.discountedPrice = discountedPrice;
        this.VAT = VAT;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public void setDiscounted(boolean discounted) {
        isDiscounted = discounted;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public int getVAT() {
        return VAT;
    }

    public void setVAT(int VAT) {
        this.VAT = VAT;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name +"\'" +
                ", price=" + price +
                ", isDiscounted=" + isDiscounted +
                ", VAT=" + VAT +
                ", quantity=" + quantity +
                  '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {

        if (!(o == null) && o instanceof Product) ;
        Product product = (Product) o;
        if (product.getPrice() == this.getPrice() &&
                this.isDiscounted() == product.isDiscounted() &&
                product.getDiscountedPrice() == this.getDiscountedPrice() &&
                this.getVAT() == product.getVAT() &&
                this.getQuantity() == product.getQuantity() &&
                this.getName().equals(product.getName())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), isDiscounted(), getDiscountedPrice(), getVAT(), getQuantity());
    }
}
