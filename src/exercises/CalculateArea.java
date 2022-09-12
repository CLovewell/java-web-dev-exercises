package exercises;

import java.util.Scanner;

public class CalculateArea {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("What is the width of the rectangle? ");
        double width = input.nextDouble();
        System.out.println("What is the length of the rectangle? ");
        double length = input.nextDouble();
        input.close();
        double area = width * length;
        System.out.println("The area of the rectangle is " + area + '.');
    }
}
