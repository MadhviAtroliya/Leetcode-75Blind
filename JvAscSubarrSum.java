package problems;

public class JvAscSubarrSum {
    public static void main(String[] args) {
        int[] nums = {100,10,1};
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                currSum += nums[i];
            } else {
                currSum = nums[i];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }
}
