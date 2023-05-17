public class App {
    public static void main(String[] args) throws Exception {

        // implicit === automatic
        // explicit === manual
        // casting === conversion
        // implicit casting happens when there is no chance for data loss
        // byte > short > int > long > float > double

        short x = 1;

        // here x under the hood is being automatic converted to integer
        // its possible to convert to integer this way because any short value fits in a integer
        // byte > short > int > long > float > double
        int y = x + 2; // => 3

        // here d is a double so we can change the type of y2 to double
        // this this time 1 is the value being automatically converted to double(1.0) 
        // byte > short > int > long > float > double
        double d = 1.1;
        double y2 = d + 1; // => 2.1

        // here we are manually converting d to integer because we want y3 to be int
        // this way d becomes 1 and then can be add it to 2
        int y3 = (int)d + 2;


        // we can't cast a string to a number, before we need to parse it
        // String s = "1";
        // int y4 = (int)s + 2; // would throw exception

        // here we parse it and then we can use it
        // each number type have its own class that has a parse method
        // ex. Float.parseFloat("1.3")
        String s = "1"; 
        int y4 = Integer.parseInt(s) + 2;

        System.out.println(y4);
    }
}
