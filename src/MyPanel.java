import lib.Circle;
import lib.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class  MyPanel extends JPanel implements MouseListener, MouseMotionListener {



    private static int strokeWidth = 2;
    private static Color mycolor = null;
    private static Point startPoint = null;
    private static Point endPoint = null;
    private static Point posMouse = null;
    private static BufferedImage bufferImage = null;
    private ArrayList<Point> mypoints;
    private Rect rect;
    private Circle circle;

    public MyPanel() {
        setLayout(null);
        setDoubleBuffered(true);
        mycolor = Color.black;
        addMouseListener(this);
        addMouseMotionListener(this);
        mypoints = new ArrayList<>();
    }
    @Override
    public void paintComponent(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;
        if (bufferImage == null) {
            bufferImage = (BufferedImage) createImage(getWidth(), getHeight());
            Graphics2D gc = bufferImage.createGraphics();
            gc.setColor(Color.WHITE);
            gc.fillRect(0, 0, getWidth(), getHeight());
            rect = new Rect(new lib.Point(50,50), 50, 100);
            circle = new Circle(new lib.Point(150, 150),50);
        }
        g2D.drawImage(bufferImage, null, 0, 0);
        if (startPoint != null && endPoint != null) {
            renderShape(g2D);
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        mypoints.add(e.getPoint());
        renderShape(bufferImage.createGraphics());
        repaint();


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
    public void renderShape(Graphics2D g2D) {

        g2D.setColor(mycolor);
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2D.setStroke(new BasicStroke(2, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND));
        g2D.drawLine(mypoints.get(0).x, mypoints.get(0).y,
                mypoints.get(0).x, mypoints.get(0).y);
        if (mypoints.size() > 1) {
            g2D.drawLine(mypoints.get(0).x, mypoints.get(0).y,
                    mypoints.get(1).x, mypoints.get(1).y);
            mypoints = new ArrayList<>();
        }
        rect.DrawF(g2D);
        circle.DrawF(g2D);
    }
}
