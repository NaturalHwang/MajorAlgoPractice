package Lecture.dp;

import java.util.Arrays;

public class P_WayToSchool {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        int [][]puddles = {{2, 2}};
        int[][] dp = new int[n+1][m+1];

        for(int[] p : puddles) {
            dp[p[1]][p[0]] = -1;
        }

        dp[1][1] = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(dp[i][j] == -1) {
                    dp[i][j] = 0;
                    continue;
                }
                if(i > 1) {
                    dp[i][j] += dp[i-1][j] % 1000000007;
                }
                if(j > 1) {
                    dp[i][j] += dp[i][j-1] % 1000000007;
                }
                dp[i][j] %= 1000000007;
            }
        }

        System.out.println(Arrays.deepToString(dp)); //
        System.out.println(dp[n][m]);
    }
}
