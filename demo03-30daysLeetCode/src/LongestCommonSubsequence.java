public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text2 == null || text1.length() == 0 || text2.length() == 0)
            return 0;

        int m = text1.length();
        int n = text2.length();
//        int[][] lcs = new int[m + 1][n + 1];
//
//        for (int i = m; i >= 0; i--) {
//            for (int j = n; j >= 0; j--) {
//                if (i == m || j == n)
//                    lcs[i][j] = 0;
//                else if (text1.charAt(i) == text2.charAt(j))
//                    lcs[i][j] = lcs[i + 1][j + 1] + 1;
//                else
//                    lcs[i][j] = Math.max(lcs[i + 1][j], lcs[i][j + 1]);
//            }
//        }
//
//        return lcs[0][0];

        return lcs(text1, text2, m, n);
    }

    public int lcs(String x, String y, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (x.charAt(m - 1) == y.charAt(n - 1))
            return lcs(x, y, m - 1, n - 1) + 1;

        return Integer.max(lcs(x, y, m, n - 1),
                lcs(x, y, m - 1, n));
    }
}

