import java.util.ArrayList;
import java.util.List;
//sort using recursion which will give TLE 

class Solution {
    public int[] sortArray(int[] nums) {
        List<Integer> l=new ArrayList(Arrays.stream(nums).boxed().toList());
        
       // System.out.println(l.toString());
        sort(l);
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public List<Integer> sort(List<Integer> l){
       
     if(l.size()==1)
         return l;
        
        //hypotheses
        Integer temp=l.get(l.size()-1);
       	l.remove(l.size()-1);
       l= sort(l);
        //induction
    return   insert(l,temp);
        
    }
   public List<Integer> insert(List<Integer> l,int temp){
    
       if(l.size() == 0 || temp >= l.get(l.size()-1)){
	
			l.add(temp);
			return l;
		}
    
    //hypotheses
       Integer val=l.get(l.size()-1);
        l.remove(l.size()-1);
    l=insert(l,temp);
    //insert
    l.add(val);
    return l;
   }
    
}
    
