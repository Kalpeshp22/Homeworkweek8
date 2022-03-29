
import java.util.Scanner;
public class Programme18SimpleCalculator {
    public static class Q18SimpleCalculator {
        //write instance variable eith double

        private double firstNumber;
        private double secondNumber;

        // getFirstNumber without any parameters,
        public double getFirstNumber(){
            return firstNumber;
        }

        //getSecondNumber without any parameters
        public double getSecondNumber(){
            return secondNumber;
        }

        //setFirstNumber with one parameter of type double
        public void setFirstNumber(double firstNumber){
            this.firstNumber = firstNumber;
        }

        //setSecondNumber with one parameter of type double
        public void setSecondNumber(double secondNumber){
            this.secondNumber = secondNumber;
        }

        // getAdditionResult without any parameters
        public double getAdditionResult(){
            return firstNumber + secondNumber;
        }

        // getSubtractionResult without any parameters,
        public double getsubtraction(){
            return firstNumber - secondNumber;
        }

        //getMultiplicationResult without any parameters
        public double getMultiplication(){
            return firstNumber * secondNumber;
        }

        //getDivisionResult without any parameters
        public double getDivisionResult(){
            if(secondNumber == 0){
                return this.secondNumber = 0;
            }else{
                return this.firstNumber/secondNumber;
            }
        }
        //declare main method
        public static void main(String[] args) {


            Q18SimpleCalculator calculator = new Q18SimpleCalculator();
            calculator.setFirstNumber(5.0);
            calculator.setSecondNumber(4);

            System.out.println("add = "+ calculator.getAdditionResult());
            System.out.println("Substract = "+ calculator.getsubtraction());
            calculator.setFirstNumber(5.25);
            calculator.setSecondNumber(0);
            System.out.println("multipy = "+ calculator.getMultiplication());
            System.out.println("Divide  = "+ calculator.getMultiplication());

        }
    }
}
