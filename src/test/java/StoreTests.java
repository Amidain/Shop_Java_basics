import org.junit.Assert;
import org.junit.Test;

public class StoreTests {
    Store store = new Store();
    int listSize = store.showAllProducts().size();

    @Test
    public void addProduct_NewProducts_Added(){

        store.addProduct(new Product("Apple", 1.35, true, 0.99, 8, 88));
        store.addProduct(new Product("Parsley",4.12, false, 4.12, 5, 33));
        store.addProduct(new Product("Dill", 0.89,  false, 0.89, 5, 21));

        Assert.assertEquals(listSize + 3, store.showAllProducts().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addProduct_NullAsParam_IllegalArgumentExceptionThrown(){
        store.addProduct(null);
    }

    @Test
    public void removeProduct_ExistingProduct_Removed(){
        Product carrot = new Product("Carrot", 2.49, false, 2.49, 5, 200 );

        store.removeProduct(carrot);
        Assert.assertEquals(listSize - 1, store.showAllProducts().size());

    }

    @Test(expected = IllegalArgumentException.class)
    public void removeProduct_NullAsParam_IllegalArgumentExceptionThrown(){
        store.removeProduct(null);
    }

    @Test
    public void showAllProducts_productsDisplayed_DisplayedSuccessfully(){
        Assert.assertEquals(store.showAllProducts(), store.showAllProducts());
    }

    @Test
    public void getQuantity_ExistingProductNameAsParam_Returned(){
        store.addProduct(new Product("Apple", 1.35, true, 0.99, 8, 88));
        store.addProduct(new Product("Parsley",4.12, false, 4.12, 5, 33));

        Assert.assertEquals(88, store.getProductQuantity("Apple"));
        Assert.assertEquals(33, store.getProductQuantity("Parsley"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void getQuantity_NotExistingProductNameAsParam_IllegalArgumentExceptionThrown(){
        store.getProductQuantity("Candle");
    }
}
