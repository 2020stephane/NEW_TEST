package lib;


import java.awt.*;

public class Rect extends Figure implements DrawFigure{

    private double width;
    private double height;

    private Rect() { }

    public Rect(Point pt1, int width, int height) {
        setPosition(pt1);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
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
    }
}
