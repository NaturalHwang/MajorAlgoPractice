package A7BinarySearch;

import java.util.Arrays;

public class B1Basic {
    public static void main(String[] args) {
//        이분 탐색은 사전에 오름차순 정렬이 되어 있어야 가능한 알고리즘
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        int left = 0;
        int right = arr.length-1;
        Arrays.sort(arr);
        int target = 6;
        int index = -1;
        while(left <= right){
            int mid = (left + right) / 2;
//            if(left==right && arr[mid]!=target){
//                System.out.println("Arr is not contains target");
//                break;
//            }
            if(arr[mid]==target){
                index = mid;
                break;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else{
                right = mid- 1;
            }
        }
//        System.out.println(index);
        System.out.println(Arrays.binarySearch(arr,10));
    }
}
