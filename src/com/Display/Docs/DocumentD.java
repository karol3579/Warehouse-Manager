package com.Display.Docs;
import com.Data.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

//panel with document's header plus document's positions
//my plan here was to "glue" doc's positions to it's header
public class DocumentD extends JPanel{
    public Document document;
    private DocumentPostionsPanel documentPostionsPanel;

    public DocumentD(Document document) {

        this.document = document;
        setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        setBackground(Color.CYAN);
        JPanel docHeader = new JPanel();
        Label l = new Label();
        JButton buttonShowDetails = new JButton("pokaż szczegóły");
        JButton buttonAddPosition = new JButton("dodaja pozycję ");


        documentPostionsPanel = new DocumentPostionsPanel(document);
        l.setText(document.getType()+" "+ document.getSymbol()+"                                           ");

        add(docHeader);
        docHeader.add(l);
        docHeader.add(buttonAddPosition);
        docHeader.add(buttonShowDetails);
        docHeader.setBackground(Color.lightGray);
        add(documentPostionsPanel).setVisible(false);

        //Button to show and hide document's positions
        buttonShowDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!documentPostionsPanel.isVisible()) documentPostionsPanel.setVisible(true);
                else documentPostionsPanel.setVisible(false);
                updateUI();

               // for (DocumentPosition d: document.getAllDocumentPositions()
               //      ) {
               //     System.out.println(d.getSymbol());
               // }
            }
        });

        // button to add document's positions
        buttonAddPosition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Warehouse w = new Warehouse();
                w.addProduct(new Product("A","A"));
                new FrameNewPosition(w);
                DocumentPosition documentPosition= new DocumentPosition(1,49.99f,
                        new Product("7330 GBB 10","TARCZE"),document);
                document.addPosion(documentPosition);
                documentPostionsPanel.add(new DocumentPositionD(documentPosition));
                updateUI();
            }
        });

    }
}
