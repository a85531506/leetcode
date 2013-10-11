public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> up=new ArrayList<Integer>();
        up.add(1);
        if(rowIndex==0)return up;
        for(int i=0;i<rowIndex;i++){
            ArrayList<Integer> curr=new ArrayList<Integer>();
            curr.add(1);
            for(int j=1;j<up.size();j++){
                curr.add(up.get(j-1)+up.get(j));
            }
            curr.add(1);
            up=curr;
        }
        return up;
    }
}