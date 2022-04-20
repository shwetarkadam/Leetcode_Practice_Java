class Solution {
    public boolean isValid(String s1) {
       HashMap<Character,Character> map=new HashMap();
        map.put('[',']');
        map.put('{','}');
        map.put('(',')');
        
        Stack<Character> s=new Stack();
        boolean f=false;
        for(int i =0;i<s1.length();i++){               //use map to keep track of corresponding elements instead of using if and else loops and stack to keep of next parenttheseis 
            if(map.containsKey(s1.charAt(i))){
                s.push(s1.charAt(i));
            }
            else if(map.containsValue(s1.charAt(i))){
              if( !s.isEmpty() && map.get(s.peek()) == s1.charAt(i)){
                  s.pop();
                  f=true;
              }else
                 return false;
                
                // char c =s.isEmpty()==false?s.pop():null;
                // if(c == null)
                //     return false;
                // char valueFromMap=map.get(c);
                // if(valueFromMap== s1.charAt(i))
                //     f=true;
                // else
                //     f=false;
            }
        }
        return s.isEmpty();
    }
}
