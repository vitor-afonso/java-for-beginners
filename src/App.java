import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {

        // having a digit like 1234567.890 
        // that we want to present to the user like $1,234,567.89 
        // we get a method that we store in a NumberFormat type
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyResult = currency.format(1234567.891);
        System.out.println(currencyResult); // => "€1,234,567.89"

        // having a digit like 0.1 
        // that we want to present to the user like 10% 
        // we get a method that we store in a NumberFormat type
        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentResult = percent.format(0.13);
        System.out.println(percentResult); // => "13%"
    }
}
