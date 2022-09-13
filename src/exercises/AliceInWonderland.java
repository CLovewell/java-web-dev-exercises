package exercises;
import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        final String wordBank = ("Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the " +
                "use of a book,' thought Alice 'without pictures or conversation?").toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a search term: ");
        String searchTerm = input.nextLine().toLowerCase();
        input.close();
        System.out.println("The search term " +
                (wordBank.contains(searchTerm) ? "is" : "is not") +
                        " in the word bank.");
        System.out.println("The first instance of the search term occurs at index " +
                wordBank.indexOf(searchTerm) + " of the word bank.");
        System.out.println("You searched for a term of length " + searchTerm.length() + '.');
        try {
           String modifiedBank = wordBank
                    .substring(0, wordBank.indexOf(searchTerm))
                    .concat(wordBank
                            .substring(wordBank.indexOf(searchTerm) + searchTerm.length()));
            System.out.println(modifiedBank);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(wordBank);
        }
    }
}
