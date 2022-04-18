class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r=new ArrayList();
       
        List<Integer> pre=new ArrayList();   //maintain this pre list to get sum of previos values
     
        pre.add(1);
        r.add(pre);
        for(int i=2;i<=numRows;i++){
            List<Integer> c=new ArrayList();
            c.add(1);
            for(int j=0;j<pre.size()-1;j++){
                c.add(pre.get(j)+ pre.get(j+1));
            }
            c.add(1);
            r.add(c);
            pre=c;       //update currecnt list
            
        }
        return r;
    }
}
