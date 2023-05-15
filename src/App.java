public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("************* ESCAPE SEQUENCES **********");

        // to add reserved characters to a string like double quotes("") or backslashes(\) we need to escape them with \  
        String greeting = "Hello \"world\"!";
        String myPath = "c:windows\\java\\";
        System.out.println(greeting);
        System.out.println(myPath);

        // there are more escape sequences like: 

        // \n that breaks to a new line
        String someName = "Casemiro \n Teixeira";
        // \t that adds a tab 
        String pastor = "Pastor\tAndré";

        System.out.println(someName);
        System.out.println(pastor);

    }
}
