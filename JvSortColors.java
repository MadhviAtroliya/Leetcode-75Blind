package problems;

public class JvSortColors {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int left = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        
        
        for (int index : nums) {
            System.out.println(index);
        }
    }
}
