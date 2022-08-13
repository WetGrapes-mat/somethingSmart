package com.somethingSmart;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Client c = new Client("ff","ff","ff");
        Category ca = new Category("pip");
        Product p = new Product(1.4567f, ca, "ffff");
        c.getCartClient().addProduct(p);
        c.doOrder();
    }
}