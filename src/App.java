import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number:");

        int input = scanner.nextInt();

        int number;

        boolean isDivisibleBy5 = input % 5 == 0;
        boolean isDivisibleBy3 = input % 3 == 0;

        if (isDivisibleBy3 && isDivisibleBy5) number = 0;
        else if (isDivisibleBy5) number = 5;
        else if (isDivisibleBy3 ) number = 3;
        else number = input;

        switch(number){
            
            case 0:
                System.out.println("FizzBuzz");
            break;
            case 5:
                System.out.println("Fizz");
            break;
            case 3:
                System.out.println("Buzz");
            break;
            default:
                System.out.println(number);
            
        }
    }
}
