//Palindrome Number
//
import java.util.Scanner;
public class Programme05 {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int palindrome = number;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = (reverse * 10) + remainder;
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.print("please enter the number : ");
        int palidrome = new Scanner(System.in).nextInt();

        if (isPalindrome(palidrome)) {
            System.out.println("Number : " + palidrome + " is a palindrome ");
        } else {
            System.out.println("Number : " + palidrome + " is not  a palindrome ");
        }
    }
}
