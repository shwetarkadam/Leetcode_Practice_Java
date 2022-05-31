class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();
     return   backtrace(0,strs,result);
    }
    public String backtrace(int len,String[]str,StringBuilder result){
        if(len>=str[0].length())
            return result.toString();
        
        char next=str[0].charAt(len);
        for(int i=1;i<str.length;i++){
            if(len>=str[i].length())
                return result.toString();
            
            if(next!= str[i].charAt(len))
                 return result.toString();
        }
        result.append(next);
     return   backtrace(len+1,str,result);
        
    }
}
