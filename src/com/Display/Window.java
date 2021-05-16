package com.Display;

import com.Data.Warehouse;
import com.Display.Docs.DocumentsPanel;
import com.Display.Warehouse.WarehousePanel;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Enumeration;

public class Window extends JFrame implements UpdateFrames{

    public static int WINDOW_WIDTH=1200,WINDOW_HEIGHT=800,
            MAIN_PANEL_WIDTH=500,MAIN_PANEL_HEIGHT;

    public Window() {

       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setLayout(new BorderLayout());
        setUIFont(new FontUIResource(new Font("Arial", 0, 15)));
        setVisible(true);
        JMenu menuSell = new JMenu("Sprzedaż");
        JMenu menuWarehouse = new JMenu("Magazyn");
        JMenuBar bar = new JMenuBar();
        add(bar,BorderLayout.NORTH);
        bar.setPreferredSize(new Dimension(100,30));
        bar.add( menuSell);
        bar.add(menuWarehouse);
        DocumentsPanel documentsPanel =new DocumentsPanel();
        WarehousePanel warehousePanel = new WarehousePanel(new Warehouse());
        add(documentsPanel,BorderLayout.CENTER);
        add(new InfoPanel(),BorderLayout.WEST);

        addMenuListener(menuWarehouse,documentsPanel,warehousePanel);
        addMenuListener(menuSell,warehousePanel,documentsPanel);

    }


    public static void setUIFont(FontUIResource f) {
        Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource) {
                FontUIResource orig = (FontUIResource) value;
                Font font = new Font(f.getFontName(), orig.getStyle(), f.getSize());
                UIManager.put(key, new FontUIResource(font));
            }
        }
    }

    private void addMenuListener(JMenu menu,JPanel delete,JPanel add){
        menu.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                remove(delete);
                add(add);
                repaint();
                revalidate();
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
    }

    @Override
    public void FrameUpdate() {
        revalidate();
    }
}
