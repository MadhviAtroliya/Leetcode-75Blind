package problems;

public class JvMissingNumber {
    public static void main(String[] args) {
        int[] a = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(a));
    }

    static int missingNumber(int[] nums) {
            int diff = 0;
            int sum = 0;
            for(int i=0;i<nums.length;i++){
                sum += i;
                diff += nums[i];
            }
            return sum+nums.length-diff;
    }
}
