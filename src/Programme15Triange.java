import java.util.Scanner;

public class Programme15Triange {

    public class Sandbox {

    }

    public static void main(String args[]) {

        Scanner ob = new Scanner(System.in);
        System.out.print("How many rows do you want?: ");
        int rows = ob.nextInt();

        for (int j = 1; j <= rows; j++) {
            for (int i = 1; i <= rows - j; i++) {
                System.out.print("");
            }

            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}