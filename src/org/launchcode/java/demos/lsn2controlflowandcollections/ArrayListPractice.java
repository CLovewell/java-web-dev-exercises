package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayListPractice {
    public static int sumEvens(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void printNLetterWords(ArrayList<String> words, int N) {
        for (String word : words) {
            if (word.length() == N) {
                System.out.print(word + " ");
            }
        }
    }

    public static void main(String[] args){
        String greenEggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        ArrayList<Integer> nums = new ArrayList<>();
        Random rng = new Random();
        for (int i = 1; i <= 12; i++) {
            nums.add(rng.nextInt(100));
        }

        System.out.println(nums);
        System.out.println(ArrayListPractice.sumEvens(nums));

        ArrayList<String> words = new ArrayList<>(
                Arrays.asList(greenEggs.split("( |, |\\. |\\.$)")));  //a list of words
       /*
        int wordCount = rng.nextInt(16) + 5;  //the number of words in the list
        for (int i = 0; i < wordCount; i++) {  //make one random word at a time
            int letterCount = rng.nextInt(12) + 1;  //the number of letters in the first word
            StringBuilder word = new StringBuilder();  //a reference to the next word
            for (int j = 0; j < letterCount; j++) {  //add one random letter at a time to the word
                word.append((char) (rng.nextInt(26) + 97));  //add the next random letter
            }
            words.add(word.toString());  //add the word to the list
        }
        */
        Scanner input = new Scanner(System.in);
        System.out.print("We are interested in words of what length? ");
        int letterCount = input.nextInt();
        input.nextLine();
        input.close();
        System.out.println(words);
        ArrayListPractice.printNLetterWords(words, letterCount);
    }
}
