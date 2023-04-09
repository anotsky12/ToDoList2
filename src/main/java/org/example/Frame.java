package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame extends JFrame {

    private TitleBar titleBar;
    private List list;
    private ButtonPanel buttonPanel;

    private JButton addTask;
    private JButton clear;


    Frame(){
        this.setSize(Constant.FRAME_SIZE_WIDTH,Constant.FRAME_SIZE_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        //this.setResizable(false);

        titleBar = new TitleBar();
        list = new List();
        buttonPanel = new ButtonPanel();

        this.add(titleBar, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);

        this.add(list, BorderLayout.CENTER);

        addTask = buttonPanel.getAddTask();
        clear = buttonPanel.getClear();

        addListener();

       show();





    }

    private void addListener () {
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                Task task = new Task();
                list.add(task);
                list.updateNumbers();
                revalidate();

                task.getDoneButton().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mousePressed(e);
                        task.changeStatus();
                        revalidate();
                    }
                });
                revalidate();

            }
        });
        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                list.removeComplitedTask();
                repaint();
            }
        });
    }



}
