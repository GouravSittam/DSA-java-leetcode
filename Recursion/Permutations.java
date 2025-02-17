
// public class Permutations {
//     public static void main(String[] args) {
//         permutations("", "abc");
//     }

//     static void permutations(String p, String up) {
//         if (up.isEmpty()) {
//             System.out.println(p);
//             return;
//         }

//         char ch = up.charAt(0);
//         for (int i = 0; i <= p.length(); i++) {
//             String f = p.substring(0, i);
//             String s = p.substring(i, p.length());
//             permutations(f + ch + s, up.substring(1));
//         }
//     }
// }

// import java.util.ArrayList;
// import java.util.List;

// public class Permutations {
//     public static void main(String[] args) {
//         List<String> result = new ArrayList<>();
//         permutations("", "abc", result);
//         System.out.println(result);
//     }

//     static void permutations(String p, String up, List<String> result) {
//         if (up.isEmpty()) {
//             result.add(p);
//             return;
//         }

//         char ch = up.charAt(0);
//         for (int i = 0; i <= p.length(); i++) {
//             String f = p.substring(0, i);
//             String s = p.substring(i, p.length());
//             permutations(f + ch + s, up.substring(1), result);
//         }
//     }
// }

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        permutations("", "abcd", result);
        System.out.println(result);
        System.out.println("Total permutations: " + result.size());
    }

    static void permutations(String p, String up, List<String> result) {
        if (up.isEmpty()) {
            result.add(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1), result);
        }
    }
}