import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        // int a1=Big.parseInt(a,2);
        // int b1=Integer.parseInt(b,2);
       // System.out.printlnnew BigInteger(b, 2);(a1+b1);
       // BigInteger b2=new BigInteger(b, 2);
   return ((new BigInteger(a, 2)).add(new BigInteger(b, 2))).toString(2);
    }
}
