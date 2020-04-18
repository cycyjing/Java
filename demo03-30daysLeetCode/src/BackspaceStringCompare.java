import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        return stack(S).equals(stack(T));
    }

    public String stack(String str) {
        // LIFO
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c != '#')
                stack.push(c);
            else if (!stack.empty())
                stack.pop();
        }
        return String.valueOf(stack);
    }

    public static void main(String[] args) {
        BackspaceStringCompare b=new BackspaceStringCompare();
        System.out.println(b.stack("ad#c"));
        System.out.println(b.backspaceCompare("ad#c","ab#c"));
    }
}
