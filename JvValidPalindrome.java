package problems;

public class JvValidPalindrome{
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        String temp = "";
        String srev = "";
        
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                temp += ""+s.charAt(i);
                srev = s.charAt(i)+srev;
            }
        }    
        return temp.toLowerCase().equals(srev.toLowerCase());        
    }
}