package mycode;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class BouncingBallApplet extends Applet implements Runnable {
    private int x = 0;  // X-coordinate of the ball
    private int y = 0;  // Y-coordinate of the ball
    private int dx = 2; // X-axis displacement value for the ball
    private int dy = 2; // Y-axis displacement value for the ball
    private Thread t;
    private boolean stopFlag;

    // Initialize the applet
    public void init() {
        setBackground(Color.WHITE);
    }

    // Start the thread
    public void start() {
        if (t == null || !t.isAlive()) { // Ensure only one thread is running
            t = new Thread(this);
            stopFlag = false;
            t.start();
        }
    }

    // Entry point for the thread that runs the animation
    public void run() {
        while (!stopFlag) {
            x += dx;
            y += dy;

            // Check for boundaries and reverse direction if necessary
            if (x > getSize().width - 30 || x < 0) dx = -dx;
            if (y > getSize().height - 30 || y < 0) dy = -dy;

            repaint();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    // Draw the ball
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 30, 30); // Draw a ball of diameter 30
    }

    // Stop the thread
    public void stop() {
        stopFlag = true;
        t = null;
    }
}

