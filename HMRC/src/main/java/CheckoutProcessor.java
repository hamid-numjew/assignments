package main.java;

import java.util.Arrays;
import java.util.List;

public class CheckoutProcessor {

    public static double checkout(List<Product> items){
        return items.stream().mapToDouble(item -> item.getPrice()).sum();
    }
}