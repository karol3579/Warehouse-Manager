package com.Data;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product){
        products.add(product);
    }
    public List<Product> getProducts() {
        return products;
    }

    public Product getProductBySymbol(String symbol){
        for (Product p: products) {
            if(p.getSymbol().equals(symbol)){
                return p;
            }
        }
               return null;
    }
}
