import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        // this program will prompt the user to input something until the value of the input equals "quit"
        //when using "true" as the condition we always need to have a condition that use "break" otherwise we will have a infinite loop
        while (true){
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();
            if (input.equals("pass"))
                continue;   // goes back to the beginning
            if (input.equals("quit"))
                break;      // stops the process
            System.out.println(input);
        }
        System.out.println("Hello, World!");
    }
}
