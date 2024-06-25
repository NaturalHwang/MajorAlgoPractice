package A3Bfs;

public class B5이동BFS {
    static int count = 0;
    public static void main(String[] args) {
        int start = 5;
        int target = 17;

        System.out.println(bfs(start,target));
//        -1, +1, 현재 숫자*2
//        가장 빠른 횟수
    }
    static int bfs(int start, int target){
        if(start==target) return 0;
        if(target %2 != 0){
            target--;
            count++;
            while(target > start){
                target = target/2;
                count++;
                if(target==start) return count;
            }
            if(target==start) return count;
            else{
                while(target!=start){
                    target++;
                    count++;
                }
            }
        } else{
            while(target > start){
                target = target/2;
                count++;
                if(target==start) return count;
            }
            if(target==start) return count;
            else{
                while(target!=start){
                    target++;
                    count++;
                }
            }
        }
        return count;
    }
}
