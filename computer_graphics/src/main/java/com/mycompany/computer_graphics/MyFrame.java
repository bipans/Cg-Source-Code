package com.mycompany.computer_graphics;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends  JFrame {
    MyFrame()
    {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);// prevent this from resiging

        this.setTitle("this Title goes here");
        this.setSize(400,400);// sets the viewport size
        this.setVisible(true);// set the visibility true
        ImageIcon image= new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123,50,250));
        
    }

}
