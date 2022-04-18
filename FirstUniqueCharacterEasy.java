class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i =0;i<s.length();i++){
        
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);      //store frequencey of each char
            
        }
        for(int j=0;j<s.length();j++){
            
           // System.out.println(map.get(s.charAt(j)));
            if(map.get(s.charAt(j)) ==1){                        //find the first char in map whose count is 1
                return j;
            }
        }
        return -1;
        
    }
}
