class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        boolean r=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' ||s.charAt(i)=='{' || s.charAt(i)=='[' ){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
                if(!stack.isEmpty()){
                 char c =stack.pop();
                    switch(c)
                    {
                    case '(':
                    r=s.charAt(i)==')'?true:false;
                            if(!r) return r;
                    break;
                    case '{':
                    r=s.charAt(i)=='}'?true:false;
                              if(!r) return r;
                    break;
                    case '[':
                    r=s.charAt(i)==']'?true:false;
                              if(!r) return r;
                    break;
                    }
                    
                }
                else
                    return false;
            }
        }
        if(!stack.isEmpty())
            return false;
        return r;
    }
}
