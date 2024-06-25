package A2dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 여행경로 {

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        System.out.println(solution(tickets));
    }

    static boolean[] visit;
    static List<String> res = new ArrayList<>();

    public static List<String> solution(String[][] tickets) {
        String[] answer = new String[tickets.length+1];
        visit = new boolean[tickets.length];
        Arrays.sort(tickets, (a,b) -> {
            return a[1].compareTo(b[1]);
        });
        dfs("ICN", tickets, new ArrayList<>());

        return res;
    }

    public static boolean dfs(String start, String[][] tickets, List<String> path){
        path.add(start);
        if (path.size() == tickets.length + 1) {
            res.addAll(path);
            return true;
        }
        for (int i = 0; i < tickets.length; i++) {
            if (!visit[i] && tickets[i][0].equals(start)) {
                visit[i] = true;
                if (dfs(tickets[i][1], tickets, path)) {
                    return true;
                }
                visit[i] = false;
            }
        }
        path.remove(path.size() - 1);
        return false;
    }
}