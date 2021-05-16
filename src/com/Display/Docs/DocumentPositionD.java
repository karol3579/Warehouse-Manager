package com.Display.Docs;

import com.Data.DocumentPosition;

import javax.print.Doc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// panel with single position
public class DocumentPositionD extends JPanel{
    Label l ;
    JButton b;
    DocumentPosition documentPosition;
    public DocumentPositionD(DocumentPosition documentPosition) {
        this.documentPosition=documentPosition;
        l = new Label();
        b = new JButton();
        b.setText("usuń");
        l.setText(documentPosition.getSymbol()+"         "+
                documentPosition.getQuantity()+" szt |"+
                documentPosition.getPrice()+" zł" );
        setBackground(Color.CYAN);
        add(l);

        add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                removeAll();
                setVisible(false);
                documentPosition.getSourceDocument().removeDocumentPosition(documentPosition);

            }
        });
    }

    public DocumentPosition getDocumentPosition() {
        return documentPosition;
    }

    public Label getL() {
        return l;
    }

    public JButton getB() {
        return b;
    }
}
