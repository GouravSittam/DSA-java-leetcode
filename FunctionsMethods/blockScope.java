


public class blockScope {
    public static void main(String[] args) {
        int a= 10;
        int b=20;
        {
            int c=30;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        System.out.println(a);
        System.out.println(b);
        // System.out.println(c); // Error: cannot find symbol
    }
    static void random(){
        
    }
    
}
