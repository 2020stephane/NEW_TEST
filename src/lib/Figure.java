package lib;

public abstract class Figure extends Point {

    private Point position;
    private  String name;

    public void setPosition(Point pt) {
        position = pt;
    }
    public Point getPosition() {
        return this.position;
    }
    public void setName(String str) {
        this.name = str;
    }

    abstract double surface();
    abstract double perimetre();

}
