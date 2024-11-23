
public class swapping {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        // swap num code
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a +  " swap "  + b);

        swap(a,b);

    }

    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;


    }

}
