package com.mycompany.computer_graphics;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class DrawCircleAlgorithm extends Canvas {
    static int xc, yc, r;

    DrawCircleAlgorithm(int xc, int yc, int r) {
        this.xc = xc;
        this.yc = yc;
        this.r = r;
    }

    @Override
    public void paint(Graphics g) {
        int x, y, p;
        x = 0;
        y = r;
        fill(g, x, y, xc, yc);
        p = 1 - r;
        while (x < y) {
            x += 1;
            if (p < 0) {
                p += 2 * x + 1;
            } else {
                y -= 1;
                p += 2 * x + 1 - 2 * y;
            }
            fill(g, x, y, xc, yc);

        }
    }

    public void fill(Graphics g, int x, int y, int xc, int yc) {

        g.fillOval(xc + x, yc + y, 5, 5);
        g.fillOval(xc + x, yc - y, 5, 5);
        g.fillOval(xc - x, yc + y, 5, 5);
        g.fillOval(xc - x, yc - y, 5, 5);
        g.fillOval(xc + y, yc + x, 5, 5);
        g.fillOval(xc + y, yc - x, 5, 5);
        g.fillOval(xc - y, yc + x, 5, 5);
        g.fillOval(xc - y, yc - x, 5, 5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the center (xc,yc)");
        int xc = sc.nextInt();
        int yc = sc.nextInt();
        System.out.println("Enter Radius :r");
        int r = sc.nextInt();
        DrawCircleAlgorithm c = new DrawCircleAlgorithm(xc, yc, r);
        JFrame f = new JFrame();
        f.add(c);
        f.setSize(800, 800);
        f.setVisible(true);
    }
}