class Solution {
    public int numMatchingSubseq(String s, String[] words) {
      //had to use map to pass the last 7 testcases map stores if the word is a asubsequence and at the same tine keep checking updating the result count
        int result=0;
        HashMap<String,Boolean>map=new HashMap();
        for(String word:words){
            if(!map.containsKey(word)){
            if(isSubsequence(s,word,s.length(),word.length())|| word.length()==0){
                result++;
                map.put(word,true);
            }else{
                map.put(word,false);
            }
            }else{
                if(map.get(word))
                    result++;
            }
        }
    return result;}
    
    
    public boolean isSubsequence(String s,String w,int sl,int wl){
        int j=0;
        for(int i=0;i<sl && j<wl;i++){
            if(s.charAt(i)==w.charAt(j))
                j++;
            
            if(j==wl)
                break;
        }
        return j==wl;
    }
}
