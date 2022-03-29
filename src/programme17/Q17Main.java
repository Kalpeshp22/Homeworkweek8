package programme17;

public class Q17Main {
    public static void main(String[] args) {
        // Make new instances of all the classes
        Q17Carpet carpet = new Q17Carpet(3.5);
        Q17Floor floor = new Q17Floor(2.75, 4.0);
        Q17Calculator calculator = new Q17Calculator(floor, carpet);

        // print out the total cost depending on the area of the floor
        System.out.println("Total=" + calculator.getTotalCost());

        // reinitialize the created instances
        carpet = new Q17Carpet(1.5);
        floor = new Q17Floor(5.4, 4.5);
        calculator = new Q17Calculator(floor, carpet);

        // again print out the total cost depending on the new area of the floor
        System.out.println("total = " + calculator.getTotalCost());

    }
}

