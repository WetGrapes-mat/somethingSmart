package com.somethingSmart;


import java.util.ArrayList;
import java.util.Date;

public class Order {
    private float priceOrder;
    private Client client;
    private String date;

    public Order(Client client){
        this.client = client;
        ArrayList<Product> temp = client.getCartClient().getCart();
        for(Product el: temp){
            this.priceOrder += el.getPrice();

        }
        this.date = new Date().toString();

        System.out.println(date);
        System.out.println(priceOrder);

    }

    public Client getClient() {
        return client;
    }

    public String getDate() {
        return date;
    }

    public float getPriceOrder() {
        return priceOrder;
    }
}
