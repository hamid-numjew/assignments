package test.java;

import main.java.CheckoutProcessor;
import org.junit.Assert;
import org.junit.Test;

public class Checkout {

    @Test
    public void processCheckout(){

        String[] items = {"Apple","Orange"};

        double total = CheckoutProcessor.checkout(items);

        Assert.assertEquals(0.85, total, 0.001);
    }
}
