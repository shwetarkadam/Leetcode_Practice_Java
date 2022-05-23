class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            
        }
        
        
        int total=0;
        boolean isOddFound=false;
        for(int c:map.values()){
            if(c%2==0){
                total+=c;
            }else{
                if(!isOddFound){
                    isOddFound=true;
                   total+=c;
                }else{
                    total+=(c-1);
                }
            }
        }
        
        return total;
    }
}
