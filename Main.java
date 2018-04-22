import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Введите текст:(для окончания ввода введите\"stop\" с новой строки)");
        InputText inputText = new ConsoleInputText();
        String str = inputText.read();
        ParceText parceText = new SpaceParceText();
        List<String> words = parceText.handle(str);
        UniqueWords uniqueWords = new UniqueWords(words);
        System.out.println("\nСписок оригинальных слов без повторений в порядке возрастания:");
        for (String word : uniqueWords.getWordSet())
            System.out.println(word);
        InputTextCheckup textCheckup = new InputTextCheckup();
        textCheckup.checkupText(str);
    }
}