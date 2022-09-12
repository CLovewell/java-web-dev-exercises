package exercises;

import java.util.Scanner;

public class FuelEconomy {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive this week? ");
        double mileage = input.nextDouble();
        System.out.println("How many gallons of gasoline did you use this week? ");
        double fuelConsumption = input.nextDouble();
        input.close();
        double fuelEconomy = mileage / fuelConsumption;
        System.out.println("Your fuel economy this week was " + fuelEconomy + " miles per gallon.");
    }
}
