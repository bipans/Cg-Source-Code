package com.mycompany.computer_graphics;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.GeneralPath;
/** A demonstration of Java2D line styles */
public class LineStyle extends JPanel{
    public String getName() {
        return "LineStyles";
    }

    public int getWidth() {
        return 450;
    }

    public int getHeight() {
        return 180;
    }

    int[] xpoints = new int[] { 0, 50, 100 }; // X coordinates of our shape

    int[] ypoints = new int[] { 75, 0, 75 }; // Y coordinates of our shape

    // Here are three different line styles we will demonstrate
    // They are thick lines with different cap and join styles
    Stroke[] linestyles = new Stroke[] {
            new BasicStroke(25.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL),
            new BasicStroke(25.0f, BasicStroke.CAP_SQUARE,
                    BasicStroke.JOIN_MITER),
            new BasicStroke(25.0f, BasicStroke.CAP_ROUND,
                    BasicStroke.JOIN_ROUND), };

    // Another line style: a 2 pixel-wide dot-dashed line
    Stroke thindashed = new BasicStroke(2.0f, // line width
            /* cap style */BasicStroke.CAP_BUTT,
            /* join style, miter limit */BasicStroke.JOIN_BEVEL, 1.0f,
            /* the dash pattern */new float[] { 8.0f, 3.0f, 2.0f, 3.0f },
            /* the dash phase */0.0f); /* on 8, off 3, on 2, off 3 */

    // Labels to appear in the diagram, and the font to use to display them.
    Font font = new Font("Helvetica", Font.BOLD, 12);

    String[] capNames = new String[] { "CAP_BUTT", "CAP_SQUARE", "CAP_ROUND" };

    String[] joinNames = new String[] { "JOIN_BEVEL", "JOIN_MITER",
            "JOIN_ROUND" };

    /** This method draws the example figure */
    public void paint(Graphics g1) {
        Graphics2D g = (Graphics2D) g1;
        // Use anti-aliasing to avoid "jaggies" in the lines
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        // Define the shape to draw
        GeneralPath shape = new GeneralPath();
        shape.moveTo(xpoints[0], ypoints[0]); // start at point 0
        shape.lineTo(xpoints[1], ypoints[1]); // draw a line to point 1
        shape.lineTo(xpoints[2], ypoints[2]); // and then on to point 2

        // Move the origin to the right and down, creating a margin
        g.translate(20, 40);

        // Now loop, drawing our shape with the three different line styles
        for (int i = 0; i < linestyles.length; i++) {
            g.setColor(Color.gray); // Draw a gray line
            g.setStroke(linestyles[i]); // Select the line style to use
            g.draw(shape); // Draw the shape

            g.setColor(Color.black); // Now use black
            g.setStroke(thindashed); // And the thin dashed line
            g.draw(shape); // And draw the shape again.

            // Highlight the location of the vertexes of the shape
            // This accentuates the cap and join styles we're demonstrating
            for (int j = 0; j < xpoints.length; j++)
                g.fillRect(xpoints[j] - 2, ypoints[j] - 2, 5, 5);

            g.drawString(capNames[i], 5, 105); // Label the cap style
            g.drawString(joinNames[i], 5, 120); // Label the join style

            g.translate(150, 0); // Move over to the right before looping again
        }
    }
    public static void main(String[] a){
        JFrame f = new JFrame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setContentPane(new LineStyle());
        f.setSize(450,200);
        f.setVisible(true);
    }
}
