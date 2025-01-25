package problems;

public class JvFind1Element {
    public static void main(String[] args) {
        int a = 2147483645;
        String b = Integer.toBinaryString(1);
        System.out.println(b);
        int count = 0;
        for(int i=0;i<32;i++){
            if(((a>>i)&1)==1){
                count++;
            }
        }
        System.out.println(count);
    }   
}
