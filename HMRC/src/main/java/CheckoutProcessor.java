package main.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckoutProcessor {

    public static double checkout(List<Product> items){
        return applyOffers(items).stream().mapToDouble(item -> item.getPrice()).sum();
    }

    protected static List<Product> applyOffers(List<Product> items){
        List<Product> products = new ArrayList<>();

        int appleCounter = 1;
        int orangeCounter = 1;

        // For performance reasons using Streams features are quite expensive
        // therefore Iterator is used to enhance applying offers
        for (Iterator<Product> it = items.iterator(); it.hasNext();){
            Product prod = it.next();

            if (prod.equals(Product.APPLE)){
                if (appleCounter < 2){
                    appleCounter++;
                    products.add(prod);
                } else{
                    appleCounter = 1;
                }

            } else if (prod.equals(Product.ORANGE)){
                if (orangeCounter < 3){
                    orangeCounter++;
                    products.add(prod);
                } else {
                    orangeCounter = 1;
                }
            }

        }
        return products;
    }
}