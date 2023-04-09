package org.example;

import javax.swing.*;
import java.awt.*;

public class List extends JPanel {


    List(){
        GridLayout gridLayout = new GridLayout(10,1);
        gridLayout.setVgap(5);

        this.setLayout(gridLayout);
        //this.setBackground(Color.BLACK);


    }
    public void updateNumbers() {
        Component[] listItems = this.getComponents();

        for(int i = 0; i < listItems.length; ++i) {
            if (listItems[i] instanceof Task) {
                ((Task)listItems[i]).changeIndex(i + 1);
            }
        }

    }

    public void removeComplitedTask() {
        Component[] var4;
        int var3 = (var4 = this.getComponents()).length;

        for(int var2 = 0; var2 < var3; ++var2) {
            Component c = var4[var2];
            if (c instanceof Task && ((Task)c).getState()) {
                this.remove(c);
                this.updateNumbers();

    }
}}}
