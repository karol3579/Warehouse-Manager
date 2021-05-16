package com.Display.Warehouse;

import com.Data.Product;
import com.Data.Warehouse;
import com.Display.Main;
import com.Display.Warehouse.WarehousePanel;
import com.Display.UpdateFrames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrameNewProduct extends JFrame {

    public FrameNewProduct(WarehousePanel warehousePanel){
         String symbol;
         String name;
         float price;

         setLayout(new FlowLayout());
         setVisible(true);
         setSize(300,300);
         JTextField sym = new JTextField("      symbol      ");
         JTextField nm = new JTextField("        nazwa        ");
         JTextField pric = new JTextField("      cena       ");
         JButton buttonAdd = new JButton("dodaj");


        add(sym);
        add(nm);
        add(pric);
        add(buttonAdd);

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Product p =new Product(sym.getText(),nm.getText());
                warehousePanel.getWarehouse().addProduct(p);
                warehousePanel.addProductD(p);
                dispose();
                for (UpdateFrames u: Main.UPDATE_FRAMES) {
                    u.FrameUpdate();
                }

            }
        });

    }
}
