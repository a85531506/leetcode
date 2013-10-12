public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ans =new ArrayList<ArrayList<Integer>>();
        if(num.length==0)return ans;
        ArrayList<Integer> rs=new ArrayList<Integer>();
        rs.add(num[0]);
        ans.add(rs);
        for(int i=1;i<num.length;i++){
            ArrayList<ArrayList<Integer>> n=new ArrayList<ArrayList<Integer>>();
            for(int j=0;j<ans.size();j++){
                ArrayList<Integer> temp=ans.get(j);
                for(int k=0;k<temp.size();k++){
                    ArrayList<Integer> nar=new ArrayList<Integer>(temp);
                    nar.add(k,num[i]);
                    n.add(nar);
                }
                ArrayList<Integer> nar=new ArrayList<Integer>(temp);
                nar.add(num[i]);
                n.add(nar);
            }
            ans=n;
        }
        return ans;
    }
}