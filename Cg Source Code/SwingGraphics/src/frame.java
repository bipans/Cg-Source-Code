import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {
    frame(){
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        MyPanel panel=new MyPanel();
        ThickLine TLine=new ThickLine();
        panel.setBackground(Color.BLACK);
        add(panel);
    }
    public static void main(String[] args) {
        new frame().setVisible(true);


    }

}
