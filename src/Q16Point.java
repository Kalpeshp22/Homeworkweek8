
//
    public class Q16Point {
    int x;
    int y;

    //constructor with no parameter
    public Q16Point() {
    }

    //constructor with parameter
    public Q16Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //method getX without any parameters, it needs to return the value of x field.
    public int getX() {
        return x;
    }

    //method getY without any parameters, it needs to return the value of y field.
    public int getY() {
        return y;
    }

    // method setX with one parameter of type int, it needs to set the value of the x field.
    public void setX(int x) {
        this.x = x;

    }

    //named setY with one parameter of type int, it needs to set the value of the y field
    public void setY(int y) {
        this.y = y;

    }

    //* Method named distance without any parameters, it needs to return the distance between this
    //Point and Point 0,0 as double.
    public double distance() {
        return distance(0, 0);

    }

    //* Method named distance with two parameters x, y both of type int, it needs to return the distance
    //between this Point and Point x,y as double.
    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));

    }

    // Method named distance with parameter another of type Point, it needs to return the distance
    //between this Point and another Point as double.
    public double distance(Q16Point secondPoint) {
        return distance(secondPoint.x, secondPoint.y);

    }

    public static void main(String args[]) {
        Q16Point first = new Q16Point(6, 5);
        Q16Point second = new Q16Point(3, 1);
        System.out.println("distance(0,0)" + first.distance());
        System.out.println("distance(second)" + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2, 2));
        Q16Point point = new Q16Point();
        System.out.println("distance() = " + point.distance());
    }
}