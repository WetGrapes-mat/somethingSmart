package com.somethingSmart;

public class Product {
    private float price;
    private Category category;
    private String nameProduct;

    public Product(float price, Category category, String nameProduct){
        this.price = price;
        this.category = category;
        this.nameProduct = nameProduct;
        category.addProduct(this);
    }

    public float getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
}
