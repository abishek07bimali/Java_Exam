/*2. Consider and take a number as input and count all the numbers that are the factors of 3 which is less
than that of the number considered. If there are no factors or the number is less than 0 then the output must be 0.*/

import java.util.Scanner;

public class FactorOf3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int inputNumber=sc.nextInt();
        int count = 0;
        if (inputNumber >0) {
            for(int i=1;i<inputNumber;i++) {
                if (3 % i == 0) {
                    count++;
                }
            }
            if(count==0){    // if count ==0 there is no any factor
                System.out.println(0);
            }
            else{
                System.out.println("The number of factor of 3 are : "+count);
            }
        }
        else{
            System.out.println(0);
        }
    }
}
