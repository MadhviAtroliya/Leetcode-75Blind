package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class JvgroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

      static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> smap = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            List<String> slist = new ArrayList<>();
            char[] strArr = strs[i].toCharArray();
            Arrays.sort(strArr);
            String str = new String(strArr);
            if(!smap.containsKey(str)){
                smap.put(str, slist);
            }
            smap.get(str).add(strs[i]);
        }
        return new ArrayList<>(smap.values());
    }

   
}
