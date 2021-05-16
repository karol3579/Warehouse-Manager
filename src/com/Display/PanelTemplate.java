package com.Display;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public abstract class PanelTemplate extends JPanel {
    List<Object> list;
    public PanelTemplate(Object listType) {
        list = new ArrayList<Object>();
    }
}
