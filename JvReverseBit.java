package problems;

public class JvReverseBit {
    public static void main(String[] args) {
      //  long n = 00000010100101000001111010011100;
        String num1 = "00000010100101000001111010011100";
        System.out.println(String.valueOf(reverseBits( Integer.parseInt(num1))));
    }

    static int reverseBits(int n) {

        return Integer.reverseBytes(n);
    }
}
