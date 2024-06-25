package A1Sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class S1HeapSort구현 {
    public static void main(String[] args) {
        int[] arr = {7,6,5,8,3,5,9,1,6};
//        최초 힙 구성
        for(int i = (arr.length/2)-1; i >= 0; i--){
            heapify(arr, arr.length-1, i);
        }
//        루트 노드와 최하위노드를 change
        for(int i = arr.length-1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, i-1, 0);
        }
//        System.out.println(Arrays.toString(arr));

        int[] arr2 = {7,6,5,8,3,5,9,1,6};
        Queue<Integer> pq = new PriorityQueue<>();
        for(int a : arr2){
//            상향식 heapify
            pq.add(a);
            System.out.println(pq);
        }

//        System.out.println(pq);
//        pq.poll();
//        System.out.println(pq);
//        pq.add(2);
//        System.out.println(pq);
    }
//    최대 힙은 부등호 방향만 바꾸면 됨.
    static void heapify(int[] arr,int arrLeng, int node){
        int left = node * 2 + 1;
        int right = node * 2 + 2;
//        왼쪽, 오른쪽 노드가 배열의 길이보다 짧아야함
        if(left > arrLeng) return;
        if(right > arrLeng){
//            노드랑 왼쪽만 비교
            if(arr[node] > arr[left]){
                int temp = arr[node];
                arr[node] = arr[left];
                arr[left] = temp;
                heapify(arr, arrLeng, left);
             }
        } else {
//            노드, 왼쪽, 오른쪽 다 비교
//        node를 제외한 left, right 중 가장 작은 노드로 다시 heapify
            int index;
            if(arr[node]> arr[left] || arr[node] > arr[right]){
                if(arr[left] > arr[right]){
                    index = right;
                } else{
                    index = left;
                }
                int temp = arr[node];
                arr[node] = arr[index];
                arr[index] = temp;
                heapify(arr, arrLeng, index);
            }
        }
    }
}
