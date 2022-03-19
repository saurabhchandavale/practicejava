package com.company;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,0,0,1,1};
        DutchNationalFlag  D = new DutchNationalFlag(nums);
        D.solve();;
        D.showResult();

    }
    private int[] nums;

    public DutchNationalFlag(int[] nums) {
        this.nums = nums;
    }
    public void solve(){
        int i = 0;
        int j = 0;
        int pivot = 1;
        int k = nums.length - 1;

        while (j <= k){
            if(nums[j] < pivot){
                swap(i,j);
                i++;
                j++;
            }else if(nums[j] > pivot){
                swap(j,k);
                k--;
            }else {
                j++;
            }
        }

    }
    public  void swap(int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public void showResult(){
        System.out.println(Arrays.toString(nums));
    }
}
