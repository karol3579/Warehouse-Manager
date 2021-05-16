package com.Display.Docs;

import com.Data.Document;
import com.Data.DocumentPosition;
import com.Data.Documents.Fak;
import com.Display.Docs.DocumentD;
import com.Data.*;
import com.Display.Window;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
//Main panel with documents
public class DocumentsPanel extends JPanel {
    List<DocumentD> documentD = new ArrayList<DocumentD>();
    List<Document> document = new ArrayList<Document>();

    public DocumentsPanel() {

        Fak f1 = new Fak("4");
        Fak f2 = new Fak("5");

        f1.addPosion(new DocumentPosition(1,9.99f,new Product("GDB 1330","KLOCKI"),f1));
        f1.addPosion(new DocumentPosition(1,149.49f,new Product("klocki","k"),f1));
        f2.addPosion(new DocumentPosition(1,149.49f,new Product("klocki","k"),f2));
        document.add(f1);
        document.add(f2);

        setLayout(new FlowLayout());
        setBackground(Color.GRAY);
        setPreferredSize(new Dimension(com.Display.Window.MAIN_PANEL_WIDTH, Window.MAIN_PANEL_HEIGHT));

        for (Document d : document) {
            documentD.add(new DocumentD(d));

        }

        for (DocumentD d: documentD) {
            if(d.document.getType().equals("FA")) add(d);
        }

    }
}


