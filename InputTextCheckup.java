import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputTextCheckup {
    public String checkupText(String string) {
        String[] words = string.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        System.out.println("\nВведите слово, которое хотите проверить на наличае в введенном тексте:");
        Scanner scanner = new Scanner(System.in);
        String searchWord = scanner.nextLine();
        for (Map.Entry<String, Integer> word : wordToCount.entrySet()) {
            if (searchWord.equals(word.getKey())) {
                System.out.println(word.getKey() + " повторяется в тексте " + word.getValue() + " раз.");
                break;
            }
        }
        return string;
    }
}