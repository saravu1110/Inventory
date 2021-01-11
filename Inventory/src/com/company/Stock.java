package com.company;

import java.util.ArrayList;

public class Stock extends Product {

    static private final ArrayList<Stock> stockList = new ArrayList<>();

    public Stock(String productName, int productPrice, int productQuantity) {
        super(productName, productPrice, productQuantity);
    }

    public static void addProductToStock(Stock product) {
        stockList.add(product);
    }

    public static void updateStockBasedOnPurchase()
    {
        ArrayList<Product> productsList = Cart.getProductInCart();
        for(Product product: productsList)
        {
            int stockIndex = 0;
            int remaining_qty = 0;
            for(Stock stock:stockList)
            {
                if(stock.getProductName().equals(product.getProductName()))
                {
                    stockIndex = stockList.indexOf(stock);
                    remaining_qty = stock.getProductQuantity() - product.getProductQuantity();
                    break;
                }
            }
            if(remaining_qty != 0)
            {
                Stock stock = stockList.get(stockIndex);
                addProductToStock(new Stock(stock.getProductName(), stock.getProductPrice() ,remaining_qty));
            }
            stockList.remove(stockIndex);
        }
    }

    public static void displayStockDetails()
    {
        // Calling stock update method here
        updateStockBasedOnPurchase();

        System.out.println();
        System.out.println("--------------STOCKS-----------");
        System.out.format("%-15s%-15s%-15s\n", "Item", "Price", "Quantity");
        for (Stock stock: stockList){
            System.out.format("%-15s%-15s%-15s\n", stock.getProductName(), stock.getProductPrice(),
                    stock.getProductQuantity());
        }
    }
}
