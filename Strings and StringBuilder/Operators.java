import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1);

        System.out.println("a" + "1");

        // this is a same after a few steps : "a" +"1"
        // integer will be converted to integer that will call toString()

        System.out.println("gobi" + new ArrayList<>());
    }

}
