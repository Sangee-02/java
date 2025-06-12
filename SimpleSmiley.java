import java.applet.Applet;
import java.awt.*;

public class SimpleSmiley extends Applet implements Runnable {
    int x = 50, y = 50, dx = 3, dy = 3;
    Thread t;

    public void init() {
        setSize(300, 300);
        setBackground(Color.white);
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            x += dx;
            y += dy;

            // Bounce off the walls
            if (x < 0 || x > getWidth() - 80) dx = -dx;
            if (y < 0 || y > getHeight() - 80) dy = -dy;

            repaint();

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {}
        }
    }

    public void paint(Graphics g) {
        // Face
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 80, 80);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(x + 20, y + 20, 8, 8);
        g.fillOval(x + 50, y + 20, 8, 8);

        // Smile
        g.drawArc(x + 20, y + 30, 40, 20, 0, -180);
    }
}
