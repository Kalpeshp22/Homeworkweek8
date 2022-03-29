package programme17;

public class Q17Floor {

    double width, length;

    public Q17Floor(double width, double length) {
        if (width < 0) this.width = 0;
        if (length < 0) this.length = 0;
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }
}


