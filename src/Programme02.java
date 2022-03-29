//2. -Read the numbers from the console entered by the user and print the minimum
//and maximum number the user has entered.

import java.util.Scanner;

public class Programme02 {

    public static void minmax() {
        Scanner scr = new Scanner(System.in);
        int max = 0;
        int min = 0;

        while (true) {
            System.out.print("Enter Number : ");
            boolean isAnInt = scr.hasNextInt();//syntax for integer number
            if (isAnInt) {
                int number = scr.nextInt();//store valid number

                if (max == 0 && number > max) max = number;
                if (min == 0 && min < number) min = number;

                if (number > max) {//if number is bigger than last Max number than store in max variable
                    max = number;
                }
                if (number < min) {//if number is smaller than last min number than store in min variable
                    min = number;
                }
            } else {
                System.out.println("Invalid Number  ");
                break;
            }
            scr.nextLine();
        }
        System.out.println("Maximum : = " + max + " and Minimum : = " + min);
        scr.close();
    }

    public static void main(String[] args) {
        minmax();
    }
}


