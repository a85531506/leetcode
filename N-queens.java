public class Solution {
    public ArrayList<String[]> solveNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String[]> ans=new ArrayList<String[]>();
        if(n==0)return ans;
        int[] seq=new int[n];
        solve(n,0,seq,ans);
        return ans;
    }
    public void solve(int n,int index,int[] seq,ArrayList<String[]> ans){
        if(index==n){
            String[] res=new String[n];
            for(int i=0;i<n;i++){
                StringBuffer temp=new StringBuffer();
                int qp=seq[i];
                for(int j=0;j<n;j++){
                    if(j==qp)temp.append("Q");
                    else temp.append(".");
                }
                res[i]=temp.toString();
            }
            ans.add(res);
            return;
        }
        int i;
        int j;
        for(i=0;i<n;i++){
            for(j=0;j<index;j++){
                if(seq[j]==i)break;
                if(Math.abs(seq[j]-i)==index-j)break;
            }
            if(j==index){
                seq[index]=i;
                solve(n,index+1,seq,ans);
            }
        }
    }
}