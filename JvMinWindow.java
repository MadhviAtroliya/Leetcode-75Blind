package problems;

import java.util.Arrays;

public class JvMinWindow {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }

    static String minWindow(String s, String t) {
        String output = "";
        //HashMap<String,Integer> hmap = new HashMap<>();
        char[] sArr = s.toLowerCase().toCharArray();
        char[] tArr = t.toLowerCase().toCharArray();
        if(t.length()>s.length()){
            return "";
        } else if (t.length()==s.length()){
            for (int i=0;i<t.length();i++) {
                Arrays.sort(sArr);
                Arrays.sort(tArr);
                if(Arrays.equals(sArr, tArr)){
                    return t;
                }
            }
        } else {
            for(int i=0;i<s.length();i++){
                for(int j=0;j<s.length();j++){
                    
                }
            }
        }
        return output;
    }
}
