package problems;

import java.util.ArrayList;
import java.util.Arrays;

public class JvIntersecctionOfTwoArr {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] num = intersect(nums1, nums2);
        for (int i : num) {
            System.out.println(i);
        }
    }

    static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0, j=0;
        ArrayList<Integer> numList = new ArrayList<>();
        while (i<nums1.length && j<nums2.length) {
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else {
                numList.add(nums1[i]);
                i++;
                j++;
            }
        }
        return numList.stream().filter(t -> t != null).mapToInt(t -> t).toArray();
        }
}
