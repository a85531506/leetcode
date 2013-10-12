public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        if(n==k){
            ArrayList<Integer> res=new ArrayList<Integer>();
            for(int i=1;i<=n;i++)res.add(i);
            ans.add(res);
            return ans;
        }
        if(k==1){
            for(int i=1;i<=n;i++){
                ArrayList<Integer> res=new ArrayList<Integer>();
                res.add(i);
                ans.add(res);
            }
            return ans;
        }
        else{
            ArrayList<ArrayList<Integer>> sub1=combine(n-1,k-1);
            ArrayList<ArrayList<Integer>> sub2=combine(n-1,k);
            ans.addAll(sub2);
            for(int i=0;i<sub1.size();i++){
                ArrayList<Integer> temp=sub1.get(i);
                temp.add(n);
                ans.add(temp);
            }
        }
        return ans;
    }
}