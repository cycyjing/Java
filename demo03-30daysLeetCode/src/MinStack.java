import java.util.Stack;

public class MinStack {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();


    public MinStack() {
    }

    public void push(int x) {
        s1.push(x);
        if (s2.isEmpty() || s2.peek() >= x) s2.push(x);
    }

    public void pop() {
        int x = s1.pop();
        if (s2.peek() == x) s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}

class Solution2 {
    private int min_val = Integer.MAX_VALUE;
    private Stack<Integer> s = new Stack<>();

    public Solution2() {
    }

    public void push(int x) {
        if (x <= min_val) {
            s.push(min_val);
            min_val = x;
        }
        s.push(x);
    }

    public void pop() {
        if (s.pop() == min_val) min_val = s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min_val;
    }

    public static void main(String[] args) {
        Solution2 minStack = new Solution2();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}

