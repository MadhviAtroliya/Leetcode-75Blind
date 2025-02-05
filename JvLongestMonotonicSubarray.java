package problems;

public class JvLongestMonotonicSubarray{
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(longestMonotonicSubarray(nums));
    }

    static int longestMonotonicSubarray(int[] nums) {
        int countAsc = 1;
        int countDesc = 1;
        int maxLen = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]) {
                countAsc++;
                countDesc = 1;
            }
            else if(nums[i-1]>nums[i]){
                countDesc ++;
                countAsc = 1;
            }
            else {
                countAsc = 1;
                countDesc = 1;
            }
            maxLen = Math.max(maxLen, Math.max(countAsc, countDesc));
        }
        
        return maxLen;
    }
}