//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) // for loop
import java.util.Scanner;

public class Programme09 {

    public static void fib(int nTerms){
        int n1 = 0;
        int n2 = 1;
        int count = 0;
        int nterms = nTerms;

        while (count < nterms) {
            System.out.println(n1);
            int nth = n1 + n2;

            n1 = n2;
            n2 = nth;

            count += 1;
        }
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("How many fibonacci terms do you want?: ");
        int nth = ob.nextInt();

        fib(nth);
    }
}


