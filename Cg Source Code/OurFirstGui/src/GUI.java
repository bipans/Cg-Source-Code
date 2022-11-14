import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int count=0;
    JLabel label;
    JFrame frame;
    JPanel panel;
public GUI()
{
  frame=new JFrame();
 panel=new JPanel();
    JButton button=new JButton("Click Me");
    button.addActionListener(this);
    label=new JLabel("Number of Clicks");
    panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
    panel.setLayout(new GridLayout(0,1));
    panel.add(button);
    panel.add(label);
    frame.add(panel,BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("OUR GUI");
    frame.pack();
    frame.setVisible(true);


}
    public static void main(String[] args) {
        new GUI();
    }
    public void  actionPerformed(ActionEvent e)
    {
count++;
label.setText("Number of Clicks:"+count);
    }
}
