public class App {
    public static void main(String[] args) throws Exception {
        String[] fruits = {"Apple", "Banana", "Mango"};
        
        // if we dont need the index use this for each loop
        // we nhave to specify the type of the items
        for(String fruit : fruits) 
            System.out.println(fruit);
    }
}
