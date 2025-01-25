package problems;


public class JvProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] prod = productExceptSelf(nums);
        for(int i=0;i<prod.length;i++){
            System.out.println(prod[i]);
        }
       
    }

    static int[] productExceptSelf(int[] nums) {
        int[] prodarr = new int[nums.length];
        prodarr[0] = 1;
        for(int i=1;i<nums.length;i++){
            prodarr[i] = prodarr[i-1] * nums[i-1];
        }
        int temp = 1;
        for(int i=nums.length-2; i>=0; i--){
             temp *= nums[i+1];
            prodarr[i] *= temp;
        }
        return prodarr;
    }
}
