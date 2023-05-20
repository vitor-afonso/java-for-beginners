import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        // this program will prompt the user to input something at least once and while the value of the input is different than "quit"
        do {
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}
