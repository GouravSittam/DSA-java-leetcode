import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);

    //     list.add(67);
    //     list.add(62);
    //     list.add(622);
    //     list.add(322);
    //     list.add(3221);
    //     list.add(32324);
    //     list.add(3221);

    //     System.out.println(list.contains(67));
    //     list.set(0,99);//change the value at the zero index to 99
    //    // list.remove(2);//remove the value at the 2nd index
    //     System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        //get the items at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass the index here, lsit[index] syntax will not worl here
        }
        System.out.println(list);


        
    }

}
