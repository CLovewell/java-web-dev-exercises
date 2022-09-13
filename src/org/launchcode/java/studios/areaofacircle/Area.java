package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double radius;
        try {
            do {
                System.out.print("Enter a radius: ");
                radius = input.nextDouble();
                if (radius < 0) {
                    System.err.println("A radius must be nonnegative.");
                }
            } while (radius < 0);
            double area = Math.round(Circle.getArea(radius) * 1000.0) / 1000.0;
            System.out.println("The area of a circle of radius " +
                    radius + " is " + area + '.');
        } catch (InputMismatchException e) {
            System.err.println("A radius must be a number.");
        } finally {
            input.close();
        }
    }
}