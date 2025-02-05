package problems;

import java.util.Arrays;
import java.util.stream.Stream;

public class JvPivotArray {
    public static void main(String[] args) {
        int[] nums = {-3,4,3,2};
        int pivot = 2;
        int left = 0;
        int right = nums.length-1;
        int[] result = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<pivot){
                result[left++] = nums[i];
            } 
            if(nums[nums.length-i-1]>pivot){
                result[right--] = nums[nums.length-i-1];
            }
        }
        while(left<=right) {
            result[left++] = pivot;
            result[right--] = pivot;
        }
        int[] output = Stream.of(Arrays.stream(nums).filter(n -> n<pivot), 
        Arrays.stream(nums).filter(n -> n==pivot), Arrays.stream(nums).filter(n -> n>pivot)).flatMapToInt(n->n).toArray();
        for (int i : output) {
            System.out.println(i);
        }
    }
}
