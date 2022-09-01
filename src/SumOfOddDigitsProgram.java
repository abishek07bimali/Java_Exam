import java.util.Scanner;

/*5 a. Write a function that accepts a positive integer number as a parameter and return the sum of its digits
which are odd.
The signature of the function is int sumOfOddDigits(int num). [5 marks]*/
import java.util.Scanner;

public class SumOfOddDigitsProgram {
    public static int findOddDigitSum(int number) {
        int lastDigit = 0;
        int oddDigitSum = 0;
        if(number<0){
            System.out.println("Negative number not allowed!!");
        }
        else {
            while (number != 0) {

                lastDigit = number % 10;

                if (lastDigit % 2 != 0) {

                    oddDigitSum += lastDigit;
                }

                number = number / 10;
            }
        }

        return oddDigitSum;
}
    public static void main(String[] args) {
        int number = 0;
        int sumOfOddDigits = 0;

        Scanner scan =  new Scanner(System.in);

        System.out.print("Enter an integer number::");
        number = scan.nextInt();


        sumOfOddDigits = findOddDigitSum(number);

        System.out.println("The sum of odd digits of the number "+number+" = "+ sumOfOddDigits);

        scan.close();
    }
}

/* Consider a function has two positive integers as variables. You have to write a logic to count the total number of
factors of each number and return 1 if the count of both is equal otherwise 0.
The signature of the function is as static int countFactors( ). [5 marks]
*/
