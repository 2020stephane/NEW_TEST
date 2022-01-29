package lib;

import java.awt.*;

public class Point {

    protected double x;
    protected double y;
    protected Color color;

//****************CONSTRUCTEURS***********************

    public Point() {
        this.x = 0;
        this.y = 0;
        this.color = Color.black;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.color = Color.black;
    }
    public Point(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

//*****************METHODES***************************

    public void setX(double x)  {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public Color getColor() {
        return this.color;
    }
    public void setColor(Color c) {
        this.color = c;
    }
}
