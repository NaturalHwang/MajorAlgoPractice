package A2Dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class D4피로도 {
    static int maxCount = 0;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        boolean[] check = new boolean[dungeons.length];
        System.out.println(dfs(k,dungeons,check,0));
    }
    public static int dfs(int k, int[][] dungeons, boolean[] check, int count){
        for(int i = 0; i < dungeons.length; i++){
            if(k >= dungeons[i][0] && !check[i]){
                check[i] = true;
                dfs(k-dungeons[i][1], dungeons, check, count+1);
//                System.out.println("i= " + i + ", k = "+ k);
                check[i] = false;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}
