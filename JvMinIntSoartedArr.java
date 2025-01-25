package problems;

public class JvMinIntSoartedArr {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums){
        int minval = nums[0];
        if(nums.length==1) return nums[0];
        for (int i=1;i<nums.length;i++){
            minval = Math.min(minval, nums[i]);
        }
        return minval;
    }
}
