import org.junit.Assert;
import org.junit.Test;

public class CartTest {
        Cart cart = new Cart();
        int listSize = cart.showAllProductsInCart().size();

    @Test
    public void addProductToCart_NewProduct_Added(){

        cart.addProductToCart(new Product("Cactus", 14.79, true, 11.29, 18, 16));

        Assert.assertEquals(listSize + 1, cart.showAllProductsInCart().size());
    }
    @Test(expected = IllegalArgumentException.class)
    public void addProductToCart_NullAsParam_IllegalArgumentExceptionThrown(){
        cart.addProductToCart(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addProductToCart_ProductNotExistingInTheShopAsParam_IllegalArgumentExceptionThrown(){
        cart.addProductToCart(new Product("Cactus", 14.79, true, 11.29, 18, 16));
    }

    @Test
    public void removeProductFromCart_ExistingProduct_Removed(){

        cart.removeProductFromCart(new Product("Carrot", 2.49, false, 2.49, 5, 3 ));

        Assert.assertEquals(listSize - 1, cart.showAllProductsInCart().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeProductFromCart_NullAsParam_IllegalArgumentExceptionThrown() {
        cart.removeProductFromCart(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeProductFromCart_NotExistingPoductInTheCart_IllegalArgumentExceptionThrown() {
        cart.removeProductFromCart(new Product("Cactus", 14.79, true, 11.29, 18, 16));
    }

    @Test
    public void getTotalPrice_ProductFromTheCart_Calculated(){
        Assert.assertEquals(7.47, cart.getTotalPrice("Carrot"), 0.01);
    }

    @Test
    public void getTotalPrice_ProductNotAddedToTheCart_Returned0(){
        Assert.assertEquals(0, cart.getTotalPrice("Pineapple"), 0.01);
    }
}
