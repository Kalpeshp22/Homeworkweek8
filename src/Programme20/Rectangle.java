package Programme20;

public class Rectangle {
    double width, length;

    public Rectangle(double width, double length){
        if (width < 0) this.width = 0;
        if (length < 0) this.length = 0;
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public double getArea(){
        return this.length * this.width;
    }
}

