package com.Display.Warehouse;

import com.Data.Product;
import com.Data.Warehouse;
import com.Display.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class WarehousePanel extends JPanel {
private Warehouse warehouse;
    List<ProductD> productsD = new ArrayList<ProductD>();

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public WarehousePanel(Warehouse warehouse) {
        this.warehouse=warehouse;
        JButton buttonAddProduct = new JButton("nowa kartoteka ");
        setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        add(buttonAddProduct);
        warehouse.addProduct(new Product("gdb 1330","klocki "));
        setBackground(Color.green);
        setPreferredSize(new Dimension(com.Display.Window.MAIN_PANEL_WIDTH, Window.MAIN_PANEL_HEIGHT));
        for (Product p: warehouse.getProducts()) {
            productsD.add(new ProductD(p));
        }

        for (ProductD p : productsD) {
            add(p);
        }

        WarehousePanel wh = this;
        buttonAddProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new FrameNewProduct(wh);
            }
        });

    }
    public void addProductD(Product product){
        ProductD p = new ProductD(product);
        productsD.add(p);
        add(p);
    }
}
