package com.company;

public class Main {

    public static void main(String[] args) {

        // Add product to stock
        Stock.addProductToStock(new Stock("Laptop", 10000, 5));
        Stock.addProductToStock(new Stock("Oven", 5000, 3));
        Stock.addProductToStock(new Stock("TV", 20000, 9));

        // Add product to cart
        Cart.addProductToCart(new Product("Laptop", 10000, 2));
        Cart.addProductToCart(new Product("Oven", 5000, 2));
        Cart.addProductToCart(new Product("TV", 20000, 1));

        // Display Bill
        BillDetails.displayBillDetails();

        // Updated Stock
        Stock.displayStockDetails();

    }
}
