import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IsPair {
    public static void main(String[] args) {
        String str = "()";
        boolean isPair = isPair(str);
        System.out.println("is pair:" + isPair);

        str = "()[]{}";
        isPair = isPair(str);
        System.out.println("is pair:" + isPair);

        str = "(]";
        isPair = isPair(str);
        System.out.println("is pair:" + isPair);
    }

    public static boolean isPair(String s) {
        int n = s.length();
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
