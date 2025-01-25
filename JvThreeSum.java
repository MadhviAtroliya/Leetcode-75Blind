package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class JvThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> outputList = threeSum(nums);
        for (List<Integer> list : outputList) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> setList = new HashSet<>(); 
        Arrays.sort(nums);      
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> sumList = new ArrayList<>();
                    sumList.add(nums[i]);
                    sumList.add(nums[j]);
                    sumList.add(nums[k]);
                    setList.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                } else if (nums[i]+nums[j]+nums[k]<0){
                    j++;
                } else{
                    k--;
                }
            }
        }
        List<List<Integer>> outputList = new ArrayList<List<Integer>>(setList);
        return outputList;
    }
}


// if (num1 + num2 + nums[i]==0){
//     sumList.add(num1);
//     sumList.add(num2);
//     sumList.add(nums[i]);
//     outputList.add(sumList);
// } 