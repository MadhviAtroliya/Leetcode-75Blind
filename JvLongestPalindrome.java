package problems;

public class JvLongestPalindrome {
    public static void main(String[] args) {
        String s  = "cbbd";
        System.out.println(longestPalindrome(s));
    }

    static String longestPalindrome(String s){
        int maxlength = 0;
        String output = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int diff=0;diff<s.length();diff++){
            //dp[i][i] = true;
            for(int i=0, j=diff;j<s.length(); i++, j++){
               if(i==j) dp[i][j] = true;
               else if(diff == 1){
                dp[i][j] = (s.charAt(i)==s.charAt(j));
               } else {
                dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]);
               }

               if(dp[i][j] && maxlength < s.substring(i, j+1).length()){
                    output = s.substring(i, j+1);
                    maxlength = output.length();
               }
               
            }
        }    
        return output;
    }



    static String longestPalindrome_ExpandFromCentre(String s) {
        if (s.length()<=1) return s;
        String output = s.substring(0, 1);
        for(int i=0;i<s.length();i++){
            String odd = expandFromCentre(s, i, i);
            String even = expandFromCentre(s, i, i+1);
            if(odd.length()>output.length()){
                output = odd;
            }
            if(even.length()>output.length()){
                output = even;
            }
        }
        return output;
    }

    static String expandFromCentre(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1, r);
    }
   
}

/*   time exceeded 
o(n^3)
        int maxlength = 1;
        String output = s.substring(0,maxlength);
        for(int i=0;i<s.length();i++){
            for(int j= i+maxlength; j<=s.length();j++){
                if(j-i>maxlength && isPalindrome(s.substring(i,j))){
                    maxlength = j-1;
                    output = s.substring(i,j);
                }
            }
        }
            
        return output;
    }

    static boolean isPalindrome(String s){
        StringBuilder str = new StringBuilder(s);
        if(s.equals(str.reverse().toString())){
            return true;
        }
        return false;
    } */