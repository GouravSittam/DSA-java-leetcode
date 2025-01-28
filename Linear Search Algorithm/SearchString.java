public class SearchString {
    public static void main(String[] args) {
        System.out.println(search("Gourav", 'o'));
    }

    static boolean search(String str, char target) {
        for (char ch : str.toCharArray())
            if (ch == target)
                return true;
        return false;
    }
}
