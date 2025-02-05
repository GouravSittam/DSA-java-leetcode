public class Q5 {
    public static void main(String[] args) {
        pattern1(4);
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            // for every row run the columns of the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");

            }
            // when one row is printed we need to add a newline
            System.out.println();

        }
    }

}
