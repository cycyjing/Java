public class ValidParenthesisString {
    public boolean checkValidString(String s) {
//        if (s.length() < 0)
//            return false;
//        if (s.indexOf(40) > s.indexOf(41))
//            return false;
//        char[] c = s.toCharArray();
//        int length = c.length;
//        int balance = 0, star = 0;
//        for (int i = 0; i < length; i++) {
//            if (c[i] == 40)
//                ++balance;
//            else if (c[i] == 41)
//                --balance;
//            else if (c[i] == 42)
//                ++star;
//            else
//                return false;
//        }
//
//        if (balance == 0 || Math.abs(balance) <= star)
//            return true;
//        return false;

        int left = 0, right = 0, n = s.length();
        char[] c = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (c[i] == '(' || c[i] == '*')
                ++left;
            else
                --left;
            if (left < 0)
                return false;
        }
        if (left == 0)
            return true;
        for (int i = n - 1; i >= 0; i--) {
            if (c[i] == ')' || c[i] == '*')
                ++right;
            else
                --right;
            if (right < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidParenthesisString v = new ValidParenthesisString();
        boolean output = v.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*");
        System.out.println(output);
    }
}
