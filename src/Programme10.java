//Write a program to input any number and check if it Armstrong number or not

public class Programme10 {

    public static int Armstrong(int a){

        int count = 0;

        for (int i =  1; i <= Integer.MAX_VALUE;i++){
            int n = i, rem, digit = 0, sum =0;

            n = i;

            digit = (int) Math.log10(n)  + 1;

            while (n > 0){

                rem = n % 10;
                sum = sum + (int)Math.pow(rem,digit);
                n = n / 10;
            }
            if (i == sum)
                count++;
            if (count==n);
            return i;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(Armstrong(n));

    }

}

