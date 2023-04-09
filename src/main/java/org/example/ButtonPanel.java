package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton addTask;
    private  JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    ButtonPanel(){
        this.setPreferredSize(new Dimension(Constant.FRAME_SIZE_WIDTH, Constant.TITLE_SIZE_HEIGHT));
        //this.setBackground(Color.RED);

        addTask = new JButton("Add new task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif", Font.BOLD,20));

        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));

        clear = new JButton("Clear complited task");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif", Font.BOLD,20));

        this.add(clear);

    }
     public  JButton getAddTask(){
        return addTask;
     }
     public  JButton getClear(){
        return clear;
     }
}
