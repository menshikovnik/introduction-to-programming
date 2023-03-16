import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static Set<String> generate(int n) {
        Set<String> result = new TreeSet<>();
        if (n == 0) {
            result.add("");
            return result;
        }
        for (int i = 1; i != n + 1; i++) {
            for (String item : generate(n - i)) {
                result.add(String.join("", Collections.nCopies(i, "(")) + String.join("", Collections.nCopies(i, ")")) + item);
                result.add(String.join("", Collections.nCopies(i, "(")) + item + String.join("", Collections.nCopies(i, ")")));
                result.add(item + String.join("", Collections.nCopies(i, "(")) + String.join("", Collections.nCopies(i, ")")));
            }
        }
        return result;
    }
}