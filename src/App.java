public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("************* PRIMITIVE TYPES **********");
        byte age = 30;

        // this gives error because byte has a range of [-127, 127]
        // byte viewsCount = 300;

        // int accepts number up to 2B
        int viewsCount1 = 123456789;

        // we can use "_" to separate a large number after every third number to make it more readable
        int viewsCount2 = 123_456_789;

        // even if long accepts numbers higher than 2B the following throws an error because java interpreted it as an "int" that has a range up to 2B
        //long viewsCount3= 3_123_456_789;

        // to solve it we need specify that it is a long adding "L" to the end
        long viewsCount4= 3_123_456_789L;

        // even if float accepts this number it throws an error because java interpreted it as double
        //float price = 10.99;
        
        // to fix the error we add "F" to the end of the number
        float price1 = 10.99F;

        // char holds only one character and must be surrounded by single quotes ''
        char letter = 'a';
        
        // String holds several characters and must be surrounded by double quotes ""
        String letters = "Casemiro";

        boolean isEnable = false;

        System.out.println(viewsCount4);

        

    }
}
