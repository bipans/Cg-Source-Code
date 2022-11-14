import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JLabel label=new JLabel();
        label.setBackground(Color.BLACK);
        label.setText("Hey can you code");

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);// prevent frame from resiging

        frame.setTitle("JFrame Title goes here");
        frame.setSize(400,400);// sets the viewport size
        frame.setVisible(true);// set the visibility true
        ImageIcon image= new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
//        frame.getContentPane().setBackground(new Color(123,50,250));
        frame.add(label);



    }
}
