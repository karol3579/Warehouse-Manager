package com.Display.Docs;

import com.Data.*;
import com.Display.Docs.DocumentPositionD;

import javax.swing.*;

//Panel of documents positions
public class DocumentPostionsPanel extends JPanel {



    public DocumentPostionsPanel(Document document){

        setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        for (DocumentPosition p: document.getAllDocumentPositions()) {
            DocumentPositionD dp=new DocumentPositionD(p);
            add(dp);

        }

    }
}
