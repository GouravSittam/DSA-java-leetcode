import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(62);
        list.add(622);
        list.add(322);
        list.add(3221);
        list.add(32324);
        list.add(3221);

        System.out.println(list);
    }

}
