package A1Sort;

import java.util.PriorityQueue;

public class 프로그래머스_야근지수 {
    public static void main(String[] args) {
        int n = 4;
        int[] works = {4,3,3};

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int work : works){
            pq.add(work);
        }
        System.out.println(pq);

        while (n > 0 && !pq.isEmpty()){
            int max = pq.poll();
            if(max > 0){
                pq.add(max-1);
            }
            n--;
        }
        long answer = 0;
        for(int work: pq){
            answer += (long)work * work;
        }
        System.out.println(answer);
    }
}
