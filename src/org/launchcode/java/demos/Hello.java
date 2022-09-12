package org.launchcode.java.demos;
import java.util.Scanner;
/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        input.close();
        System.out.println("Hello " + name + '!');
    }
}
