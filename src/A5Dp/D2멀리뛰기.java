package Lecture.dp;

public class D2멀리뛰기 {
    public static void main(String[] args) {
        int n = 1999;
        long answer = 0;
        if(n==0) System.out.println(0);
        if(n==1) System.out.println(1);
        long[] arr = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i < arr.length; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }
        answer = arr[n];
        System.out.println(answer);
    }
}
