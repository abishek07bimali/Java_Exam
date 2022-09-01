
/*4. Write a function that accepts an array of non-negative integers and returns the second largest integer in the
array. Return -1 if there is no second largest integer.
The signature of the function is int findSecondLargest(int[ ] a).*/

import java.util.Scanner;
public class SecondLargest {
    Scanner sc=new Scanner(System.in);
    int findSecondLargest(int[] a){
        System.out.println("Enter the "+a.length+" numbers: ");
        for (int i=0;i<a.length;i++) {
            int in=sc.nextInt();
            if (in > 0) {
                a[i] = in;
            }
            else {
                System.out.println("Negative number is not allowed.");
                break;
            }
        }
        int largest = 0;
        int secondLargest = 0;
        for (int j : a) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            }
        }
        if (secondLargest==0){
            return -1;
        } else {
            return secondLargest;
        }
    }
    public static void main(String[] args) {
        int [] second=new int[10];
        SecondLargest secondLargest=new SecondLargest();
        System.out.println(secondLargest.findSecondLargest(second));
    }
}
