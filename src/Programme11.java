//  Even Digit Sum

import java.util.Scanner;
public class Programme11 {

    public static int getEvenDigitSum(int number) {
        int total = 0;
        if (number > 0) {
            while (number != 0) {

                int even = number % 10;

                if (even % 2 == 0) {
                    total += even;
                }
                number /= 10;
            }
            System.out.println("Answer is :  "+ total);
        }else {
            System.out.println("invalid number  -1 ");
        }
        return -1;
    }

    public static void main(String[] args) {
        // user input
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1 = scr.nextInt();
        getEvenDigitSum(num1);

    }
}

