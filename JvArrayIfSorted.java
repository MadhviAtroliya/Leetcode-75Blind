package problems;

public class JvArrayIfSorted {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
       System.out.println(check(nums));
    }

    static boolean check(int[] nums) {
        int count = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>nums[(i+1)%nums.length]) count++;
        //     if(count>1) return false;
        // }
        for(int i=1;i<nums.length;i++){
            System.out.println("nums[i-1] "+ nums[i-1]);
            System.out.println("nums[i] "+ nums[i]);
            if(nums[i-1]>nums[i]) count++;
           
        }
        if(nums[0]<nums[nums.length-1]) {
            System.out.println("nums[0] "+ nums[0]);
            System.out.println("nums[nums.length-1] "+ nums[nums.length-1]);
            count++;
        }
      
        return count<=1;
    }
}