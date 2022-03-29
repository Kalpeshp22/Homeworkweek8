package Programme20;

public class Cuboid extends Rectangle {
    double height;


    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return this.height * this.width * this.length;
    }
}
