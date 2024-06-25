package A2Dfs;

import java.util.*;

public class D5네트워크 {
    static List<List<Integer>> adjList;
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(Arrays.deepToString(computers));
        boolean[] visited = new boolean[n];
        int answer = 0;
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                bfs(i, computers, visited);
                answer++;
            }
        }
        System.out.println(answer);
//        dfs(0,computers,visited);
    }
//    static void dfs(int start, int[][] computers, boolean[] visited){
//        if(start == computers.length){
//
//        }
//        Stack<int[]> s = new Stack<>();
//        visited[start] = true;
//        s.push(new int[]{start,0});
//        while(!s.isEmpty()){
//            int[] now = s.pop();
//            for(int i = 0; i < computers.length; i++){
//
//            }
//        }
//    }
    public static void bfs(int start, int [][] com, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i = 0; i < com.length; i++){
                if(com[node][i] == 1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
