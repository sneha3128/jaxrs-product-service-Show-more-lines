package com.product;

public class ProductResource {

    public void getProducts() {
        System.out.println("GET /products");
    }

    public void getProductById(int id) {
        System.out.println("GET /products/" + id);
    }

    public void createProduct() {
        System.out.println("POST /products");
    }
}
