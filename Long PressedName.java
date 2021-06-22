class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
        if(name.length()==1 &&typed.length()==1){
            if(name.charAt(0)==typed.charAt(0))
                return true;
            else{
                return false;
            }
        }
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
                
            }else{
                if(j==0 || typed.charAt(j)!=typed.charAt(j-1)){//j==0 is added becoz j-1 will give error in some cases.
                    return false;
                }
                j++;
            }
        }
        if(i!=name.length())
            return false;
         while(j < typed.length()) { //what if some character is left at the end even after you traverse name such as name="Alex" typed="aaleexa"
        if(typed.charAt(j) != typed.charAt(j-1)) return false;
        j++;
    }
        return true;
}
}
