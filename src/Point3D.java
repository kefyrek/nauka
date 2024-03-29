public class Point3D extends Point2D {
private double z;

    public Point3D(double x, double y, double z){
        super (x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double getZ_cm() {
        return z*100;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double relation() {
        return Math.sqrt(super.relation()*super.relation()+z*z);
    }
}
