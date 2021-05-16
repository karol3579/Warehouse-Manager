package com.Display.Docs;

import com.Data.Document;
import com.Data.Product;
import com.Data.Warehouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FrameNewPosition extends JFrame {

    public FrameNewPosition(Warehouse warehouse) {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);

        JTextField searchBar  = new JTextField();
        searchBar.setPreferredSize(new Dimension(150,30));
        add(searchBar);

        JTextField textCena = new JTextField("0.0");
        JButton buttonAdd = new JButton("dodaj");


           buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }


    private void  addElementsToCB(JComboBox comboBox, List<Product> productList){
        for (Product p : productList) {
            comboBox.addItem(p.getSymbol());
        }

    }

}
