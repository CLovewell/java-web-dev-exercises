package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        String myString;/* = "If the product of two terms is zero then common sense " +
                "says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side " +
                "of the equation to equal zero. Once you’ve done that, it’s " +
                "pretty straightforward from there.";*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string, any string.");
        myString = input.nextLine();
        input.close();

        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> tabulation = new HashMap<>();

        for (Character c : charactersInString) {
            if (Character.isLetter(c)) {
                c = c.toString().toLowerCase().toCharArray()[0];
                if (!tabulation.containsKey(c)) {
                    tabulation.put(c, 1);
                } else {
                    tabulation.put(c, tabulation.get(c) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> charCount : tabulation.entrySet()) {
            System.out.println(charCount);
        }
    }
}
