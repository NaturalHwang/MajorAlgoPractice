package A7BinarySearch;

import java.util.Arrays;

public class B2Basic2 {
    public static void main(String[] args) {
//        target을 찾되,
//        target이 없으면 target보다 큰 값중에 첫번째 값을 찾아라
        int[] arr = {1,3,4,5,7,8,9};
        int start = 0;
        int end = arr.length-1;
        int target = 6;
//        int index = -1;

//        while(start <= end){
//            int mid = (start + end) / 2;
////            if(arr[mid]!= target && start == end){
////                index = mid;
////            }
////            if(arr[mid]==target){
////                index = mid;
////                break;
////            }else if(arr[mid] < target){
////                start = mid + 1;
////            } else{
////                index = mid; // 추가된 부분
////                end = mid - 1;
////            }
//            if(arr[mid] >= target){
//                index = mid;
//                end = mid - 1;
//            } else{
//                start = mid + 1;
//            }
//        }
//        System.out.println(index);

//        가까운 값 찾기
        int[] arr2 = {10,20,30};
//        System.out.println(Arrays.binarySearch(arr2,35));
//        System.out.println(Arrays.binarySearch(arr2,25));
//        System.out.println(Arrays.binarySearch(arr2,9));

        int index2 = Arrays.binarySearch(arr, target);
        if(index2 < 0){
            System.out.println(Math.abs(index2)-1);
        } else System.out.println(index2);
    }
}
