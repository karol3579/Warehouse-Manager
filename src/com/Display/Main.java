package com.Display;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<UpdateFrames> UPDATE_FRAMES= new ArrayList<UpdateFrames>();
    public static void main(String[] args) {
        Window window=new Window();
        UPDATE_FRAMES.add(window);

    }
}
