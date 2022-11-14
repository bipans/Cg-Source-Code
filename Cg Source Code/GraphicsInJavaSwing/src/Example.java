import javax.swing.*;
import java.awt.*;

public class Example extends JFrame {
    Example()
    {
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        MyPanel panel=new MyPanel();
        panel.setBackground(Color.BLACK);
        add(panel);
    }
    public static void main(String[] args) {
        new Example().setVisible(true);

    }
}
