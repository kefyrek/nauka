public class Point2D {
    protected double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getX_cm() {
        return x *100;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public double getY_cm() {
        return y*100;
    }

    public void setY(double y) {
        this.y = y;
    }



}
}
