import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // to read input from the user we use Scanner class
        // in the Scanner() we specify where we gonna read the input from
        // to read from the terminal we use System.in
        Scanner scanner = new Scanner(System.in);
        
        // here we use just "print" so that the input can be added in the same line.
        System.out.print("Age: ");

        // here we store the input with the type of the input
        // since the type of the input we are expecting is byte it must be a number between -128 and 127 
        byte age = scanner.nextByte();
        
        // we call nextLine after nextByte so that the input can be "reseted" and run the next step as expected
        // otherwise name will get an empty string automatically
        // without it name would nome be promped and 
        // the final result would be "Name: you are 44"
        scanner.nextLine();

        System.out.print("Name: ");
        // if we want to read a string we use .next or .nextLine
        // if we enter "Full name" with .next we get "Full"
        // if we enter "Full name" with .nextLine we get "Full name"
        // we should also trim it using nextLine
        String name = scanner.nextLine().trim();
        System.out.println("You are " + age + " " + name);

    }
}
