package test.java;

import main.java.CheckoutProcessor;
import main.java.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Checkout {

    @Test
    public void processCheckout(){

        List<Product> items = Arrays.asList(Product.APPLE, Product.ORANGE);

        double total = CheckoutProcessor.checkout(items);

        Assert.assertEquals(0.85, total, 0.001);
    }

    @Test
    public void processCheckoutWithOneAppleTwoOranges(){

        List<Product> items = Arrays.asList(Product.APPLE, Product.ORANGE, Product.ORANGE);

        double total = CheckoutProcessor.checkout(items);

        Assert.assertEquals(1.10, total, 0.001);
    }
}
