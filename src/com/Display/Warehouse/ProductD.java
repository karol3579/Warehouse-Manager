package com.Display.Warehouse;

import com.Data.Product;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductD extends JPanel {
    public ProductD(Product product) {
        JLabel labelProduct = new JLabel();
        setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        String labelText = product.getSymbol()+"         ||      "+product.getName() +
                "   " + product.getQuantity() + "  szt   " + product.getPrice() + " zł";
        labelProduct.setText(labelText);
        add(labelProduct);


    }
}
