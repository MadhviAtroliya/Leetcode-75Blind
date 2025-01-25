package problems;

import java.util.HashMap;
import java.util.Map;

public class JvTwosum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] output = twoSum(nums, target);
        for (int i = 0; i<output.length;i++) {
            System.out.println(output[i]);
        }
       
    }

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nmap = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int diff = target - nums[i];
            if (nmap.containsKey(diff)){
                return new int[]{nmap.get(diff), i};
            }
            nmap.put(nums[i], i);
        }
        return new int[]{};
    }
}
