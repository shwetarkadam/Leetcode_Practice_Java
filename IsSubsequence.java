class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")) //one testcase where string is empty
            return true;
        int j=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(j))
                j++;
            
            if(j==s.length())
                break;
        }
        return j==s.length();
    }
}
