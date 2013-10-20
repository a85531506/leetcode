public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        if(S.length==0)return ans;
        Arrays.sort(S);
        ArrayList<Integer> first=new ArrayList<Integer>();
        ans.add(first);
        int begin=0;
        for(int i=0;i<S.length;i++){
            int end=ans.size();
            for(int j=begin;j<end;j++){
                ArrayList<Integer> temp=new ArrayList<Integer>(ans.get(j));
                temp.add(S[i]);
                ans.add(temp);
                if(i+1<S.length&&S[i]==S[i+1])begin=end;
                else begin=0;
            }
        }
        return ans;
    }
}