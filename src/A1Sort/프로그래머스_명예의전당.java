package A1Sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class 프로그래머스_명예의전당 {
    public static void main(String[] args) {
        int k = 3;
        Queue<Integer> pq = new PriorityQueue<>(k);
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++){
            if(pq.size()== k){
                if(pq.peek() <score[i]){
                    pq.poll();
                    pq.add(score[i]);
                }
            } else pq.add(score[i]);
            answer[i] = pq.peek();
        }
        System.out.println(Arrays.toString(answer));
    }
}