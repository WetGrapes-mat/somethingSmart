package com.somethingSmart;


import java.util.ArrayList;

public class Client extends User {
    private Cart cartClient;

    public Client(String password, String login, String userName) {
        super(password, login, userName);
        this.cartClient = new Cart();
    }

    public Cart getCartClient() {
        return cartClient;
    }

    class Cart {
        private ArrayList<Product> cart = new ArrayList<>();

        public ArrayList<Product> getCart() {
            return cart;
        }

        public void addProduct(Product product) {
            this.cart.add(product);
        }

        public void clearCart() {
            this.cart.clear();
        }
    }
}
