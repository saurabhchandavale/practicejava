package com.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr ={-2,-1,2,3,4,5,6,7,8,9,18};
        //int[] arr ={18,7,5,4,3,2,1,-1,-2};
        int ans = binarySearch(arr, 18);
        System.out.println(ans);

    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //find the middle element
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                //ans found
                return  mid;
            }

            if(isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;

                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;

                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
