package com.company;

import java.util.ArrayList;

public class Cart {

    static private final ArrayList<Product> productsList = new ArrayList<>();

    public static void addProductToCart(Product product) {

        productsList.add(product);
    }

    public static ArrayList<Product> getProductInCart()
    {
        return productsList;
    }
}
