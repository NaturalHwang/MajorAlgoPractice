package A7BinarySearch;

import java.util.Arrays;

public class 프로그래머스_입국심사 {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {3,4,7,10};
        Arrays.sort(times);
        long left = 1;
        long right = ((long) (times[times.length - 1]) * n);
        long answer = right;
        while(left <= right){
            long mid = (left + right) / 2;
            long sum = 0;
            for(int t : times){
                sum += mid / t;
            }
            System.out.println("total time: "+mid + ", immigrations: "+ sum);
            if(sum >= n){
                right = mid - 1;
                answer = mid;
            } else{
                left = mid + 1;
            }
            System.out.println(answer);
        }
        System.out.println(answer);
    }
}
