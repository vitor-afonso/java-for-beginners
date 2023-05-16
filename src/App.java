public class App {
    public static void main(String[] args) throws Exception {

        // this results in 3 
        // because we specified it as int in the beginning 
        int result = 10 / 3;

        //to have a float result we need to convert the numbers to float or double 
        double result2 = (double)10 / (double)3; // the result is 3.3333333333333335
        System.out.println(result2);


        System.out.println("********* INCREMENT AND DECREMENT OPERATORS ********* ");

        int x = 1; 

        // y receives 1 and after increments the value of x
        // which results with y having the value of 1 and x of 2
        // int y = x++; 
        
        // this way x is incremented before its value is assigned to y
        // resulting in x being 2 and n being 2
        // int y = ++x; 

        // if we want to only increment the value of y we do
        int y = x + 1; // resulting in x being 1 and y being 2
        

        System.out.println(x);
        System.out.println(y);
    }
}
