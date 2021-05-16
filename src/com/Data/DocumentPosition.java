package com.Data;

import com.Data.*;

public class DocumentPosition {
    float quantity;
    float price;
    private Product product;
    private String symbol;
    private Document sourceDocument;
    public DocumentPosition(float quantity, float price, Product product,Document document) {
        this.quantity = quantity;
        this.price = price;
        this.product=product;
        this.symbol=product.getSymbol();
        this.sourceDocument=document;
    }

    public float getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public String getSymbol() {
        return symbol;
    }

    public Document getSourceDocument() {
        return sourceDocument;
    }
}
