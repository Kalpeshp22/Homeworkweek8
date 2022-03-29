
import java.util.Scanner;
public class ReadingUserInputChallenge {

    public void addition() {
        Scanner scr = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 10) { //condition for input number
            System.out.print("Enter " + count + " number : ");

            boolean validno = scr.hasNextInt();
            if (validno) {
                int number = scr.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid input number");
            }
            scr.nextLine();//for new user input
        }
        //sum of user input number
        System.out.println("Sum of all the input number : " + sum);

        scr.close();
    }

    public static void main(String[] args) {
        ReadingUserInputChallenge obj = new ReadingUserInputChallenge();
        obj.addition();
    }

}

