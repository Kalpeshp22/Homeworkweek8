//  Display left angle triangle of * using nested for loops
public class Programme15 {

    public static void printStars(int n) {

        for (int j = 1; j <= n; j++) {

            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        printStars(n);
    }
}

