
import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,45,6,4,5,45,4,4,4,54,5,5,5,5,5,5,3,3,4);
        mult(1,3,"Hello","World");

        
    }

    static void mult(int a, int b, String ...v){
        

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    
}
