import com.homework.service.TextFormatter;
import com.homework.service.TextFormatterImpl;

import static com.homework.util.Constants.*;

public class Main {
    private static final TextFormatter textFormatter = new TextFormatterImpl();

    public static void main(String[] args) {
        System.out.println(TEXT);
        System.out.println("\nЗадание 1: " + homeWork1(TEXT));
        System.out.println("\nЗадание 2: " + homeWork2(TEXT));
        System.out.print("\nЗадание 3: ");
        homeWork3(TEXT);
        System.out.print("\n\nЗадание 4: ");
        homeWork4(TEXT);
    }

    private static String homeWork1(String text) {
        int firstLetterIndex = text.indexOf('а');
        int secondLetterIndex = text.lastIndexOf('в');
        return text.substring(firstLetterIndex, secondLetterIndex);
    }

    private static String homeWork2(String text) {

        return text.replace(text.charAt(3), text.charAt(0));
    }

    private static void homeWork3(String text) {
        String[] words = ((TextFormatterImpl) textFormatter).getSplitStringArray(text);
        for (String word : words) {
            if (word.equals(TextFormatterImpl.reverseString(word)) && word.length() > 1) {
                System.out.print(word + " ");
            }
        }
    }

    private static void homeWork4(String text) {
        String[] sentences = text.replaceAll("\n", "").split("\\.");
        for (String sentence : sentences) {
            int wordCount = textFormatter.getWordsCount(sentence);
            if ((wordCount >= MIN_SIZE && wordCount <= MAX_SIZE) || textFormatter.isPalindrome(sentence)) {
                System.out.println(sentence);
            }
        }
    }
}
