// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
     ArrayList<String> l=new ArrayList<String>();
    ArrayList<String> permutation(String S){
        String ip=new String(S);
        
       
        String op=new String(ip.toString().substring(0,1));
      // System.out.println(op.toString());
        ip=ip.substring(1);
      //  System.out.println(ip.toString());
        solve(ip,op);
       Collections.sort(l);
        return l;
        
    }
    public void solve(String ip,String op){
        if(ip.length()==0){
            l.add(op);
        return;
        }
        
        String op1=new String(op);
        String op2=new String(op);
        op1+=" "+ip.charAt(0);
         op2+=ip.charAt(0);
       
       // l.add(op1.toString());
     //   l.add(op2.toString());
       ip=ip.substring(1);
        solve(ip,op1);
        solve(ip,op2);
        
    }
    
}
