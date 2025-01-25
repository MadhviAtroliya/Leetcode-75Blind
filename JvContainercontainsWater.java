package problems;

public class JvContainercontainsWater {
    public static void main(String[] args) {
        int[] height = {8,7,2,1};
        System.out.println(maxArea(height));
    }

    static int maxArea(int[] height) {
        int area = 0;
        int width = 0;
        int hgt = 0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            width = j-i;
            hgt = Math.min(height[i], height[j]);
            area = Math.max(area, width*hgt);
            if(height[i]<height[j]){
                i++;
            } else {
                j--;
            }

        }
        return area;
    }
}
