package com.company;

public class Product {

    private final String productName;
    private final int productPrice;
    private final int productQuantity;

    public Product(String productName, int productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {

        return this.productName;
    }

    public int getProductPrice() {

        return this.productPrice;
    }

    public int getProductQuantity() {

        return this.productQuantity;
    }

    public int getProductPriceBasedOnQuantity() {

        return this.productQuantity * this.productPrice;
    }
}
