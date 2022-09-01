/*3. Consider and take a number as input and sum all the numbers that are not the factors of 3 which is less
than that of the number considered. If all the numbers are the factors or the considered number is less than 0 then
the output must be 0.
Note: You must use break and continue statements.
 */

import java.util.Scanner;

public class FactorNot {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number: ");
            int inputnumber=sc.nextInt();
            int sum = 0;
            int count=0;
            if (inputnumber >0) {
                for(int i=1;i<=inputnumber;i++) {
                    if (3%i == 0) {
                        count++;
                    }
                    else{
                        sum+=i;
                        continue;
                    }
                }
//                counting the number of factor
                if(count==inputnumber){
                    System.out.println(0);
                }
            }
            else{
                System.out.println(0);
            }
            System.out.println("The sum of all number which is not a factor of 3 are: "+sum);
        }
}
