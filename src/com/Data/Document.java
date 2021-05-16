package com.Data;

import java.util.ArrayList;
import java.util.List;

public abstract class Document  {
   private String status;
   private int id;
   private String type;
   private String symbol;
   private List<DocumentPosition> positions = new ArrayList<DocumentPosition>();

    public Document(String type, String symbol) {
        this.status = status;
        this.id = id;
        this.type = type;
        this.symbol = symbol;

    }

    public void addPosion(DocumentPosition position){
        positions.add(position);
    }

    public DocumentPosition getDocumentPosition(int index){
        return positions.get(index);
    }
    public String getStatus() {
        return status;
    }

    public void removeDocumentPosition(DocumentPosition documentPosition){
        for (DocumentPosition p: positions) {
            if(p==documentPosition){
                positions.remove(p);
                break;
            }
        }
    }
    public List<DocumentPosition> getAllDocumentPositions(){
        return positions;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getSymbol() {
        return symbol;
    }
}
