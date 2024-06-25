package A3Bfs;

import java.util.*;

public class B1Basic2 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] dist;
    public static void main(String[] args) {
        int[][] arr = {{0,1},{0,2}, {1,3}, {2,3}, {2,4}};
//        배열을 하나 만들어서, 이배열에 각 노드가 start node에서 얼마나 떨어져 있는지 숫자값 담기
        dist = new int[5];
        adjList = new ArrayList<>();
        visited = new boolean[5];
        for(int i = 0; i < 5; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] a : arr){
            adjList.get(a[0]).add(a[1]);
        }
//        bfs로 각 나오는 각 노드 방문하고 출력
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        while(!queue.isEmpty()){
            int temp = queue.poll();
            System.out.println(temp);
            visited[temp] = true;
            for(int target : adjList.get(temp)){
//                target을 queue에 add하기 전에 true로 세팅
                if(!visited[target]){
                    queue.add(target);
                    dist[target] = dist[temp]+1;
                    visited[target] = true;
                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }
//    static void bfs(int node){
//        boolean[] visited = new boolean[adjList.size()];
//        Queue<Integer> q = new LinkedList<>();
//        q.add(node);
//        visited[node] = true;
//        while(!q.isEmpty()){
//            int now = q.poll();
//            System.out.println(now);
//            for(int i : adjList.get(now)){
//                if(!visited[i]){
//                    q.add(i);
//                    visited[i] = true;
//                }
//            }
//        }
//    }
}
