package com.company;

import java.util.ArrayList;

public class BillDetails {

    public static int getTotalPrice()
    {
        ArrayList<Product> productsList = Cart.getProductInCart();
        int totalPrice = 0;
        for (Product product: productsList) totalPrice = totalPrice + product.getProductPriceBasedOnQuantity();

        return totalPrice;
    }

    public static void displayBillDetails()
    {
        System.out.format("%-15s%-15s%-15s%-15s\n", "Item", "Price", "Quantity", "value");
        ArrayList<Product> productsList = Cart.getProductInCart();
        for (Product product: productsList){
            System.out.format("%-15s%-15s%-15s%-15s\n", product.getProductName(), product.getProductPrice(),
                    product.getProductQuantity(), product.getProductPriceBasedOnQuantity());
        }
        System.out.format("%-15s%-15s%-15s%-15s\n", "Total Price", "", "", getTotalPrice());

    }

}
