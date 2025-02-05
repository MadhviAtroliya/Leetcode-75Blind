package problems;

import java.util.ArrayList;
import java.util.List;

public class JvWordSubsets {
    public static void main(String[] args) {
        String[] words1 = {"acaac","cccbb","aacbb","caacc","bcbbb"};
        String[] words2 = {"c","cc","b"};
        System.out.println(wordSubsets(words1, words2));
    }

    static List<String> wordSubsets(String[] words1, String[] words2) {
       List<String> outpList = new ArrayList<>();
       int[] freq = new int[26];
       for(String s : words2){
            int[] temp = calFreq(s);
        
            for(int i=0;i<26;i++){
                freq[i] = Math.max(freq[i], temp[i]); 
            }
       }

       for(String s: words1){
        int[] temp = calFreq(s);
        boolean isValid = true;
        for(int i=0;i<26;i++){          
            if(temp[i]<freq[i]){
                isValid = false;
                break;
            }
        }
        if (isValid) outpList.add(s);
       }
          return outpList;
    }  

    static int[] calFreq(String s){
        int[] freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        return freq;
    }
}
