package main.java;

import java.util.Arrays;

public class CheckoutProcessor {

    public static double checkout(String[] items){

        double total = Arrays.stream(items).map(item -> {
            switch (item){
                case "Apple":
                    return new Double(0.60);
                case "Orange":
                    return new Double(0.25);
                default:
                    return new Double(0.0);
            }
        }).mapToDouble(Double::doubleValue).sum();

        return total;
    }
}