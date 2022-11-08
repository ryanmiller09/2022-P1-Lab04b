import java.applet.Applet;
import java.awt.*;
import java.util.Random;
public class Temp extends Applet {
    public void paint(Graphics g) {
        for (int k = 0; k <= 100; k++) {
        Random rand = new Random();

        int x1 = rand.nextInt(1000);
        int y1 = rand.nextInt(650);
        int width = rand.nextInt(400);
        int height = rand.nextInt(400);



            g.drawRect(x1, y1, width, height);
        }
    }

}

