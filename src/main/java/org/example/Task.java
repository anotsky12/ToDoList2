package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Task extends JPanel {
    private JLabel index;
    private JTextField textOfTask;
    private JButton doneButton;

    private boolean checked;

    Task(){
        this.setPreferredSize(new Dimension(40,20));
        this.setBackground(Color.RED);

        this.setLayout(new BorderLayout());
        checked = false;

        index = new JLabel("");
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index , BorderLayout.WEST);

        textOfTask = new JTextField("Task here");
        textOfTask.setBorder(BorderFactory.createEmptyBorder());
        textOfTask.setBackground(Color.RED);
        this.add(textOfTask, BorderLayout.CENTER);

        doneButton = new JButton("done");
        doneButton.setPreferredSize(new Dimension(40,20));
        doneButton.setBorder(BorderFactory.createEmptyBorder());
        this.add(doneButton, BorderLayout.EAST);


    }
    public JButton getDoneButton(){
        return doneButton;
    }
    public void changeStatus (){
        this.setBackground(Color.GREEN);
        textOfTask.setBackground(Color.GREEN);
        checked = true;

    }

    public void changeIndex(int num) {
        this.index.setText(String.valueOf(num));
        this.revalidate();
    }
    public boolean getState() {
        return this.checked;
    }

}
