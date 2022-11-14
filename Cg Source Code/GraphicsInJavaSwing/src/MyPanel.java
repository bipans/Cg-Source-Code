import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
// after this line put the graphics code
        g.setColor(Color.white);
        g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        g.drawString("Hello World",50,50);
        g.drawLine(100,100,200,150);
        //g.drawRect(100,200,100,50);
        g.fillRect(100,200,100,50);
        g.drawOval(300,200,150,150);
        g.drawArc(350,200,100,150,0,270);
        int x[]={100,200,300};
        int y[]={400,300,400};
        int xPoints[]={100,200,300};
        int yPoints[]={400,600,300};
        g.drawPolygon(x,y,3);
        g.drawPolyline(xPoints,yPoints,3);
        String url="src/IMG_1525.JPG";
        Image image=new ImageIcon(url).getImage();
        g.clearRect(0,0,500,500);
        g.drawImage(image,300,50,200,100,null);

    }
}
