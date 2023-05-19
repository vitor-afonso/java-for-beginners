import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount of loan: ");
        int loan = scanner.nextInt();
        
        System.out.print("Annual interest rate: ");
        float annualInterest = scanner.nextFloat() / PERCENT; //to get percentage p/ year

        float monthlyInterest = annualInterest / MONTHS_IN_YEAR; //to get percentage p/ month
        
        System.out.print("Years to pay loan: "); 
        byte years = scanner.nextByte();
        
        int numberOfPayments = years * MONTHS_IN_YEAR;

        // formula to calculate monthlyPayment => https://www.wikihow.com/Calculate-Mortgage-Payments#Calculating-Mortgage-Payments-with-an-Equation

        double monthlyPayment = loan * (monthlyInterest * Math.pow(1 + monthlyInterest ,numberOfPayments)) / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1) ;

        String monthlyPaymentFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayment);
 
        System.out.println("Monthly mortgage: " + monthlyPaymentFormatted);
        
    }
}
