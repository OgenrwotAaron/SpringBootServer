package com.example.demo.product;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
  @RequestMapping(value = "/products", method = RequestMethod.GET)
  public ResponseEntity<ArrayList<Product>> getProducts() {
    ProductRepository repo = new ProductRepository();
    return new ResponseEntity<ArrayList<Product>>(repo.getProducts(), HttpStatus.OK);
  }
}
