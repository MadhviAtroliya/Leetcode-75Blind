package problems;

public class JvMaxSubArr {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    static int maxSubArray(int[] nums){
        int maxSumArr = 0;
        int currSum = nums[0];
        if (nums.length == 1) return nums[0];
        for (int i=1;i<nums.length;i++){
            currSum += nums[i];
            currSum = Math.max(currSum, nums[i]);
            maxSumArr = Math.max(maxSumArr, currSum);
            }
        return maxSumArr;
    }
}
