class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> l=Arrays.stream(nums).boxed().toList();
     List<Integer> even=  l.stream().filter(i->i%2==0).collect(Collectors.toList());
    List<Integer> odd=  l.stream().filter(i->i%2!=0).collect(Collectors.toList());
       l=new ArrayList<Integer>();
      l.addAll(even);
      l.addAll(odd);
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}
