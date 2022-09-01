
/*1. In Yakutia, Russia the surrounding temperature goes down up to -83.9°Fahrenheit which is very cold. So, the
 government has issued a notice that when the surrounding temperature goes down from 32°Farenheit, the time to remain
 outside is reduced to 45 minutes which is decreased by every 5 minutes with respect to decrease in temperature by
 10°Farenheit till -62°Farenheit. And when the temperature goes down from -62°Farenheit then each individual is restricted
 from being outside. Write a program that accepts the surrounding temperature and display whether an individual can remain
 outside.

Consider that the highest temperature recorded is 101.1°Farenheit.*/

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = input.nextDouble();
        temperatureStatus(temperature);
    }

    static void temperatureStatus(double temperature){
        if(temperature>101.1){
            System.out.println("Highest Temperature recorded!!");
        }
        else if (temperature<=32 && temperature>=-62){
            double time = (32+temperature)*0.5;
            System.out.println("Stay outside for "+time+" minutes");
        }
        else if(temperature<-62){
            System.out.println("Individual is restricted from being outside");
        }
        else {
            System.out.println("You can stay outside!");
        }
    }
}