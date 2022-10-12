// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)

    {
        g.drawLine(50,25,250,25);
        g.drawLine(50,25,100,75);
        g.drawLine(100,75,300,75);
        g.drawLine(250,25,300,75);
        g.drawLine(50,25,50,225);
        g.drawLine(50,225,100,275);
        g.drawLine(100,75,100,275);
        g.drawLine(50,225,250,225);
        g.drawLine(100,275,300,275);
        g.drawLine(250,225,300,275);
        g.drawLine(250,25,250,225);
        g.drawLine(300,75,300,275);



        g.drawOval(550,50,250,250);
        g.drawOval(550,150,250,50);
        g.drawOval(550,125,250,100);
        g.drawOval(550,100,250,150);
        g.drawOval(650,50,50,250);
        g.drawOval(625,50,100,250);
        g.drawOval(600,50,150,250);



        g.drawOval(670,410,120,120);
        g.drawLine(850,350,625,450);
        g.drawLine(850,350, 750,575);
        g.drawLine(625,450, 750,575);
        g.drawOval(625,350,250,250);



        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



        // DRAW APCS



        // DRAW PACMEN FLOWER



    }

}


