// Display right angle triangle of @ using nested for loops

import java.util.Scanner;

public class Programme08 {

    public static void printNums(int n) {
        int i, j, num;
        Scanner car = new Scanner(System.in);
        for (i = 0; i < n; i++) // outer loop for rows
        {
            num = 1;
            for (j = 0; j <= i; j++) // inner loop for rows
            {
                // printing num with a space
                System.out.print("@");
                //incrementing value of num
                num++;
            }
            // ending line after each row
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        printNums(n);
    }
}

