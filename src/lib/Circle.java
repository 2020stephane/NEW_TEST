package lib;

import java.awt.*;

public  class Circle extends Figure implements DrawFigure {

    int rayon = 0;

    private Circle() { }

    public Circle(Point pt, int rayon){

        setPosition(pt);
        this.rayon = rayon;
    }


    @Override
    double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    double perimetre() {
        return 2 *Math.PI * rayon;
    }

    @Override
    public void DrawF(Graphics2D g2d) {
        Point pos = getPosition();
        g2d.drawOval((int)pos.getX(), (int)pos.getY(),
                rayon, rayon);
        g2d.drawString("circle : ", 50, 335);
        g2d.drawString("position : X = " + getPosition().getX() +
                "  Y = " + getPosition().getY() + "  Rayon = " +
                rayon, 60, 350);
    }
}
