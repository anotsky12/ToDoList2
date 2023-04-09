package org.example;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {

    TitleBar(){

        this.setPreferredSize(new Dimension(Constant.FRAME_SIZE_WIDTH,Constant.TITLE_SIZE_HEIGHT));

        JLabel textOnTitleBar = new JLabel();


        textOnTitleBar.setText("To-Do list");
        textOnTitleBar.setFont(new Font("Sans-serif", Font.BOLD, 25));
        textOnTitleBar.setHorizontalAlignment(JLabel.CENTER);


        this.add(textOnTitleBar);


    }


}

