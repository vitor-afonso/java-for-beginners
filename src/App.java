import java.util.Date;
public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("************* REFERENCE TYPES **********");

        Date now = new Date();

        // code snippet for System.out.print() = sout + tab
        System.out.println(now);

        System.out.println("************* STRINGS **********");

        String message = "Hello world" + "!!";

        System.out.println(message.endsWith("!!"));

        

    }
}
