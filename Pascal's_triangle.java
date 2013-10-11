public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        if(numRows==0)return ans;
        for(int i=1;i<=numRows;i++){
            ArrayList<Integer> level=new ArrayList<Integer>();
            level.add(1);
            if(i>1){
                ArrayList<Integer> temp=ans.get(i-2);
                for(int j=2;j<i;j++){
                    int num=temp.get(j-2)+temp.get(j-1);
                    level.add(num);
                }
                level.add(1);
            }
            ans.add(level);
        }
        return ans;
    }
}