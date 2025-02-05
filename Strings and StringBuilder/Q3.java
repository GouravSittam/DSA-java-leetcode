public class Q3 {
    public static void main(String[] args) {
        pattern1(5);
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            // for every row run the col
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");

            }
            // when one row is printed we need to add a newline
            System.out.println();

        }
    }

}
