class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack();
        Stack<Character> t1=new Stack();
        
        for(int i=0;i<s.length();i++){
       
           //  System.out.println(s.charAt(i));
            if(s.charAt(i)=='#'){
            //     System.out.println("inside");
                if(!s1.isEmpty())
                s1.pop();
             //      System.out.println(s1);
            }else
                
                 s1.push(s.charAt(i));
        }
        
           for(int j=0;j<t.length();j++){
          
            if(t.charAt(j)=='#')
            {// System.out.println("inside t");
                 if(!t1.isEmpty())
                t1.pop();
           //    System.out.println(t1);
            }
               else
                 t1.push(t.charAt(j));
        }
      //  System.out.println(s1);
        //  System.out.println(t1);
        if(s1.equals(t1))
            return true;
        else
            return false;
        
        
    }
}
