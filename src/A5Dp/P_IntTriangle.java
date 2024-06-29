package Lecture.dp;

import java.util.Arrays;

public class P_IntTriangle {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3,8}, {8,1,0}, {2,7,4,4}, {4,5,2,6,5}};
        int[][] sum = new int[triangle.length][];

        for (int i = 0; i < triangle.length; i++) {
            sum[i] = new int[triangle[i].length];
        }

        sum[0][0] = triangle[0][0];

        for(int i = 1; i < triangle.length; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0){
                    sum[i][j] = sum[i-1][j] + triangle[i][j];
                } else if(j == i){
                    sum[i][j] = sum[i-1][j-1] + triangle[i][j];
                } else{
                    sum[i][j] = Math.max(sum[i-1][j-1], sum[i-1][j]) + triangle[i][j];
                }
            }
        }
        int answer = 0;
        for(int i = 1; i < sum.length; i++){
            if(sum[sum.length-1][i] > answer){
                answer = sum[sum.length-1][i];
            }
        }
        System.out.println(Arrays.deepToString(sum));
        System.out.println(answer);
    }
}
