class Solution {
    public int[] countBits(int n) {
         return IntStream.range(0, n+1).map(Integer::bitCount).toArray();
    }
}
