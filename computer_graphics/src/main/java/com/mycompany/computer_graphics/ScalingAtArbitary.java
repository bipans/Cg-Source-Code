package com.mycompany.computer_graphics;

import javax.swing.*;
import java.awt.Graphics;

class ScalingAtArbitary extends JFrame {
    int x1 = 50;
    int y1 = 50;
    int x2 = 100;
    int y2 = 100;
    int sx = 4;
    int  sy = 4;
    //Arbitrary points are:
    int tx = 50;
    int ty = 50;
    int px1,px2,py1,py2;

    public ScalingAtArbitary()
    {
        setTitle("Line Scaling at an arbitrary point");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        px1 = x1*sx + tx*(1-sx);
        px2 = x2*sx + tx*(1-sx);
        py1 = y1*sy + ty*(1-sy);
        py2 = y2*sy + ty*(1-sy);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        g.drawLine(x1, y1, x2, y2);
//    g.drawLine(px1, py1, px2, py2);
    }

    public static void main(String args[])
    {
        new ScalingAtArbitary();
    }
}