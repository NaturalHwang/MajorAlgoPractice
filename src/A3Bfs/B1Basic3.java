package A3Bfs;

import java.util.*;

public class B1Basic3 {
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
        int start = 0;
        int end = 3;
        int minDistance = bfs(start,end);
        System.out.println(minDistance);
    }
    static int bfs(int start, int end){
//        Queue<Integer> queue = new LinkedList<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start,0});
        visited = new boolean[5];
//        dist = new int[5];
        visited[start] = true;
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            visited[temp[0]] = true;
            for(int target : adjList.get(temp[0])){
                if(!visited[target]){
                    queue.add(new int[]{target, temp[1] + 1});
                    visited[target] = true;
//                    dist[target] = dist[temp] + 1;
                    if(target == end){
//                        return dist[target];
                        return temp[1] + 1;
                    }
                }
            }
        }
        return 0;
    }
}
