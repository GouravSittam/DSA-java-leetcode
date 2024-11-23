

public class passingExample {
    public static void main(String[] args) {
        String name = "Gourav Chaudhary";
        greet(name);
    }
    //scope of name is only in main method
    //this is scopeing
    static void greet(String name){
        System.out.println(name);
    }
}
