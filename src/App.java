public class App {
    public static void main(String[] args) throws Exception {

        // Math.round rounds up or down 
        int a = Math.round(1.1F); // => 1

        // Math.ceil rounds up 
        int b = (int) Math.ceil(1.1F); // => 2

        // Math.floor rounds down 
        int c = (int) Math.floor(1.1F); // => 1

        // Math.max return max of 2 values
        float d = (float) Math.max(1.2, 2.1); // => 2.1

        // Math.min return min of 2 values
        float e = (float) Math.min(1, 2.1); // => 1
        
        // Math.random return num between 0 and 1
        double f = Math.random(); // => num between 0 and 1
        // this returns 0 because the explicit cast is applied only to Math.random()
        int f1 = (int) Math.random() * 10; // => 0
        // now our explicit cast is applied to the result of the expression
        int f2 = (int) (Math.random() * 10); // => num between 0 and 10

        System.out.println(f);
    }
}
