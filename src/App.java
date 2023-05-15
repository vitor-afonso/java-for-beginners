import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("************* MULTI-DIMENSIONAL ARRAYS **********");

        // defining a multi-dimensional array (mdNumbers)
        // that contains 2 arrays 
        // that contains 3 items in each of the 2 arrays
        int[][] mdNumbers = new int[2][3];

        System.out.println(Arrays.deepToString(mdNumbers)); // [[0, 0, 0], [0, 0, 0]]

        // accessing/defining the first item of the first array
        mdNumbers[0][0] = 1;
        System.out.println(Arrays.deepToString(mdNumbers)); // [[1, 0, 0], [0, 0, 0]]

        // accessing/defining the third item of the second array
        mdNumbers[1][2] = 5;

        System.out.println(Arrays.deepToString(mdNumbers)); // [[1, 0, 0], [0, 0, 5]]
        

        // USING CURLY BRACKET SYNTAX

        int[][] numArr = {{1,2,3},{4,5,6}};

        System.out.println(Arrays.deepToString(numArr));

    }
}
