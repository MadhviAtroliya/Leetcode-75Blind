package problems;

public class JvCountingBits{
    public static void main(String[] args) {
        int[] bits = countBits(5);
        for (int bit : bits) {
            System.out.println(bit);
        }
      //  System.out.println(Integer.toBinaryString(2));
    }

    static int[] countBits(int n) {
        int[] bitsarr = new int[n+1];
        for(int i=0;i<=n;i++){
            bitsarr[i] = bitsarr[i>>1]+ (i&1);
        }
        
        return bitsarr;
    }
}