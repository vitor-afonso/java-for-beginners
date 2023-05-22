import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int loan = 0;
        float annualInterest = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Amount of loan (€1k - €1M): ");
            loan = scanner.nextInt();
            if ((loan >= 1000 && loan <= 1_000_000)){
                break;
            }
            System.out.println("Please enter a number between 1,000 and 1,000,000.");    
        };
        
        while (true) {
            System.out.print("Annual interest rate: ");
            annualInterest = scanner.nextFloat(); 
            if ((annualInterest > 0 && annualInterest <= 30)){
                annualInterest = annualInterest / PERCENT; //to get percentage p/ year
                monthlyInterest = annualInterest / MONTHS_IN_YEAR; //to get percentage p/ month
                break;
            }
            System.out.println("Please enter a number greater than 0 and less than or equal to 30.");         
        } ;
        
        while (true) {
            System.out.print("Years to pay loan: "); 
            byte years = scanner.nextByte();
            if (years > 0 && years <= 40){
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Please enter a number greater than 0 and less than or equal to 40.");         
        };

        // formula to calculate monthlyPayment => https://www.wikihow.com/Calculate-Mortgage-Payments#Calculating-Mortgage-Payments-with-an-Equation
        double monthlyPayment = loan * (monthlyInterest * Math.pow(1 + monthlyInterest ,numberOfPayments)) / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1) ;

        String monthlyPaymentFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayment);
 
        System.out.println("Monthly mortgage: " + monthlyPaymentFormatted);
        
    }
}
