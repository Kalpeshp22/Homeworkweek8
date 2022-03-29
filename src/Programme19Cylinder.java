public class Programme19Cylinder extends Programme19Circle {
    double height;

    public Programme19Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        if (height > 0) {
            return height;
        } else {
            height = 0;
            return height;
        }
    }

    public double getVolume() {
        double area = getArea() * getHeight();
        return area;
    }
}