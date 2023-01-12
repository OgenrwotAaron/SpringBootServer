package com.example.demo.product;

import java.util.ArrayList;

public class ProductRepository {
  private ArrayList<Product> products;

  public ProductRepository() {
    this.products = new ArrayList<Product>();
    this.products.add(new Product("Tomato"));
  }

  public ArrayList<Product> getProducts() {
    return this.products;
  }
}
