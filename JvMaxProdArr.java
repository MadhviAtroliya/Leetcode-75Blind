package problems;

public class JvMaxProdArr {
    public static void main(String[] args) {
        int[] nums = {-3,0,1,-2};
        System.out.println(maxProduct(nums));
    }

    static int maxProduct(int[] nums) {
        int leftProd = 1;
        int rightProd = 1;
        int maxProd = nums[0];
        for (int i = 0; i<nums.length; i++) {
        // variable = (condition) ? expressionTrue : expressionFalse;
            leftProd = (leftProd == 0) ? 1 : 1;
            //if (leftProd==0) leftProd=1;
            if (rightProd==0) rightProd=1;
            leftProd *= nums[i];
            rightProd *= nums[nums.length-1-i];
            maxProd = Math.max(maxProd, Math.max(leftProd, rightProd));
        }
        return maxProd;
    }
}
