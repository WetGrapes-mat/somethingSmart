package com.somethingSmart;

import java.util.ArrayList;

public class Category {
    private String nameCategory;
    private ArrayList<Product> allProduct = new ArrayList<>();

    public Category(String nameCategory){
        this.nameCategory = nameCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

//    public void setNameCategory(String nameCategory) {
//        this.nameCategory = nameCategory;
//    }

    public ArrayList<Product> getAllProduct() {
        return allProduct;
    }
    public void addProduct(Product product) {
        this.allProduct.add(product);
    }

    public void clearCategory(){
        this.allProduct.clear();
    }


}
