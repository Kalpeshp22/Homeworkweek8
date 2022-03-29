// First And Last Digit Sum
//Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//The method needs to find the first and the last digit of the parameter number passed to the method,
//using a loop and return the sum of the first and the last digit of that number.
//If the number is negative then the method needs to return -1 to indicate an invalid value.
import java.util.Scanner;

public class Programme07 {

    //method to find the sum of first and lastdigit
    public static int sumFirstAndLastDigit(int number) {

        //declare variable
        int lastDigit, firstDigit, divisor;
        int totalDigit, sum;

        //find last digit
        lastDigit = number % 10;

        //find total number of digits
        totalDigit = findDigits(number);

        //calculator divisor value
        divisor = (int) Math.pow(10, totalDigit - 1);

        //find first digit
        firstDigit = number / divisor;

        //add value
        sum = firstDigit + lastDigit;
        return sum;
    }

    //method to find total number of digit
    private static int findDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    //declare main method
    public static void main(String[] args) {

        //declare variable
        int number, sum;

        //create  scanner class object
        Scanner scan = new Scanner(System.in);

        //read input
        System.out.println("Enter an integer number : ");
        number = scan.nextInt();

        //find sum of digit of number
        sum = sumFirstAndLastDigit(number);

        //display result
        System.out.println("The sum of first & last digit of the number " + number + " = " + sum);

        //close scanner class object
        scan.close();

    }
}

