import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        

        System.out.println("************* ARRAYS **********");

        // arrays have a fixed lenght and we cand add or remove items from them

        int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 2;
        // this throws an exception: Index 6 out of boundsfor length 3
        // numbers[6] = 7;

        // because this is a array of integers and we did not define the third element, it will get the value of 0
        // if it was an array of strings the non defined elements would get values of empty strings
        

        // to print the array this way we get "[I@135fbaa4" which is a string calculated based on the address of the array in the memory
        System.out.println(numbers);

        // to see the actual array of integers we use the Arrays class from java.util.Arrays
        System.out.println(Arrays.toString(numbers));   


        // a better way for defining arrays that we know what values they will contain is
        int[] myNumbers = {14,7,21};
        Arrays.sort(myNumbers); // sorts in ascending order
        System.out.println(myNumbers.length);
        System.out.println(Arrays.toString(myNumbers));

    }
}
