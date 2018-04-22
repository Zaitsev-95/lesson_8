import java.util.Scanner;

public class ConsoleInputText implements InputText {
    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder line = new StringBuilder();
        while (!scanner.hasNext("stop")) {
            line.append(scanner.nextLine());
            line.append(" ");
        }
        return line.toString();
    }
}