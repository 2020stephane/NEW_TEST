package lib;


import java.awt.*;

/**
 * classe rectangle
 *
 * @see lib.Figure
 */
public class Rect extends Figure implements DrawFigure{

    private double width;
    private double height;

    private Rect() { }

    /**
     * @param pt1
     * @param width
     * @param height
     */
    public Rect(Point pt1, int width, int height) {
        setPosition(pt1);
        this.width = width;
        this.height = height;
    }

    /**
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double surface() {
        return width * height;
    }

    @Override
    double perimetre() {
        return (2 * (width + height));
    }

    @Override
    public void DrawF(Graphics2D g2d) {
        g2d.drawRect((int) getPosition().getX(),(int) getPosition().getY(),
                (int) width, (int) height);
        g2d.drawString("rectangle : ", 50, 300);
        g2d.drawString("position : X = " + getPosition().getX() +
                "  Y = " + getPosition().getY() + "  width = " +
                width + "  height = " + height, 60, 315);
        }

}
