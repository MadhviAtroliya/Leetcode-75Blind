package problems;

public class JvPalindromicSubstring {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }

    static int countSubstrings(String s) {
        int noOfSubstring = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int diff=0;diff<s.length();diff++){
            for(int i=0, j=diff; j<s.length(); i++, j++){
                if(i==j) dp[i][j] = true;
                else if(diff==1) dp[i][j]= (s.charAt(i)==s.charAt(j));
                else{
                    dp[i][j] = (s.charAt(i)==s.charAt(j) && dp[i+1][j-1]);
                }
                if(dp[i][j]){
                    noOfSubstring++;
                }
            }
        }
        return noOfSubstring;
    }
}
