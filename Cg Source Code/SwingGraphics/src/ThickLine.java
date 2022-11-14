import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class ThickLine {
    ThickLine()
    {
        JFrame jf=new JFrame("Demo");
        Container cp=jf.getContentPane();
        cp.add(new JComponent() {
            public void paintComponent(Graphics g)
            {
                Graphics2D g2=(Graphics2D) g;
                g2.setStroke(new BasicStroke(10));
                g2.draw(new Line2D.Float(30,20,80,90) );
                }


        });
                jf.setSize(300,200);
                jf.setVisible(true);
    }
}
