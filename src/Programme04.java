// Digit Sum Challenge
import java.util.Scanner;
public class Programme04 {

    public static int sumDigits(int num) {
        int Answer = 0;
        while (num > 0) {
            Answer += num % 10;
            num /= 10;
        }
        return Answer;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Input an integer number : ");
        int digit = scr.nextInt();
        sumDigits(digit);
        System.out.println();
        System.out.println("The sum is : " + sumDigits(digit));
    }
}

