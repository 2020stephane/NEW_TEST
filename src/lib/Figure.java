package lib;

public abstract class Figure extends Point {

    private Point position;

    public void setPosition(Point pt) {
        position = pt;
    }
    public Point getPosition() {
        return this.position;
    }

    abstract double surface();
    abstract double perimetre();

}
