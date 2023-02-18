public class Rectangle extends Figure{
    public Rectangle(Point p1, Point p2) {
        super(p1, p2);
    }

    @Override
    public double getSurface() {
        double a = p1.distance(new Point(p2.x, p1.y));
        double b = p1.distance(new Point(p1.x, p2.y));
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle@"+ Integer.toHexString(hashCode()) +" {" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
