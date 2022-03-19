package com.company;
import java.util.Arrays;
public class ReverseArrayP {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ReverseArrayP p = new ReverseArrayP();
        //p.solve(nums);
        System.out.println(Arrays.toString((p.solve(nums))));
//        for(int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }
    }
    public int[] solve(int[] nums){
        int lowIndex = 0;
        int highIndex = nums.length-1;

        while(lowIndex < highIndex){
            swap(nums, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }
        return nums;
    }
    private void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
