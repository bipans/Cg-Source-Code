package com.mycompany.computer_graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.cyan);
        g.drawString("This is swing",100,200);
        g.setFont(new Font (Font.SANS_SERIF,Font.BOLD,30));
        g.drawLine(100,100,200,150);
        //g.drawRect(100,200,100,50);
        g.fillRect(100,200,100,50);
        g.drawOval(300,200,100,100);
        g.drawArc(300,200,100,100,0,350);
        int x[]={100,200,300};
        int y[]={400,300,400};
        int n=3;
        int xpoints[]={100,200,300};
        int ypoints[]={500,450,500};
        g.fillPolygon(x,y,n);

        g.drawPolyline(xpoints,ypoints,n);
        String url="src/test.jpg";
        Image image=new ImageIcon(url).getImage();
        g.drawImage(image,300,50,200,100,null);
       // g.clearRect(0,0,500,500);
        g.draw3DRect(300,300,200,50,false);

    }
}
