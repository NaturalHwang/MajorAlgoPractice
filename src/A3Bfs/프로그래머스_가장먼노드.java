package A3Bfs;

import java.util.*;

public class 프로그래머스_가장먼노드 {
    static int n;
    static List<List<Integer>> adjList;
    static boolean[] check;
    static int[] dist;
    public static void main(String[] args) {
        n = 6;
        adjList = new ArrayList<>();
        int [][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        for(int i = 0; i <= n; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] a : edge){
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }
        bfs(1);
        int max = Arrays.stream(dist).max().getAsInt();
        int count = (int)Arrays.stream(dist).filter(a->a==max).count();
        System.out.println(count);
    }
    static void bfs(int start){
        check = new boolean[n+1];
        dist = new int[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] = true;
        dist[start] = 1;
        while(!q.isEmpty()){
            int now = q.poll();
            for(int next : adjList.get(now)){
                if(!check[next]){
                    q.add(next);
                    check[next] = true;
                    dist[next] = dist[now] + 1;
                }
            }
        }
    }
}
