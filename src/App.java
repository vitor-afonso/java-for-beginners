import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final byte MONTHS_IN_YEAR = 12;
        Scanner scanner = new Scanner(System.in);
        int loan = getLoanAmount(scanner);
        float monthlyInterest = getMontlhyInterest(MONTHS_IN_YEAR, scanner);
        int numberOfPayments = getNumberOfPayments(MONTHS_IN_YEAR, scanner);
        double montlyMortgage = getMonthlyMortgage(loan, monthlyInterest, numberOfPayments);
        String formattedMontlyMortgage = getAmountInCurrency(montlyMortgage);
 
        System.out.println("Monthly mortgage: " + formattedMontlyMortgage);
        
    }

    static int getLoanAmount(Scanner scanner){
        int amount = 0;
        while (true) {
            System.out.print("Amount of loan (€1k - €1M): ");
            amount = scanner.nextInt();
            if ((amount >= 1000 && amount <= 1_000_000)){
                return amount;
            }
            System.out.println("Please enter a number between 1,000 and 1,000,000.");    
        }
    }

    static float getMontlhyInterest(byte MONTHS_IN_YEAR, Scanner scanner){
        final byte PERCENT = 100;
        float annualInterest = 0;
        while (true) {
            System.out.print("Annual interest rate: ");
            annualInterest = scanner.nextFloat(); 
            if ((annualInterest > 0 && annualInterest <= 30)){
                annualInterest = annualInterest / PERCENT; //to get percentage p/ year
                return annualInterest / MONTHS_IN_YEAR; //to get percentage p/ month
               
            }
            System.out.println("Please enter a number greater than 0 and less than or equal to 30.");         
        } 
    }

    static int getNumberOfPayments(byte MONTHS_IN_YEAR, Scanner scanner){
        byte years = 0;
        while (true) {
            System.out.print("Years to pay loan: "); 
            years = scanner.nextByte();
            if (years > 0 && years <= 40){
                return years * MONTHS_IN_YEAR;
            }
            System.out.println("Please enter a number greater than 0 and less than or equal to 40.");         
        }
    }
    
    static double getMonthlyMortgage(int loan, float monthlyInterest, int numberOfPayments){
        // formula to calculate monthlyPayment => https://www.wikihow.com/Calculate-Mortgage-Payments#Calculating-Mortgage-Payments-with-an-Equation
        return loan * (monthlyInterest * Math.pow(1 + monthlyInterest ,numberOfPayments)) / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1);
    }

    static String getAmountInCurrency(double amount){
        return NumberFormat.getCurrencyInstance().format(amount);
    }
}
