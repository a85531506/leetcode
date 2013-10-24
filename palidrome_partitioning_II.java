public class Solution {
    public int minCut(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len=s.length();
        boolean[][] isP=new boolean[len][len];
        for(int i=len-1;i>=0;i--){
            for(int j=i;j<len;j++){
                if(i==j)isP[i][j]=true;
                else if(j==i+1){
                    if(s.charAt(j)==s.charAt(i))isP[i][j]=true;
                }
                else{
                    if(s.charAt(j)==s.charAt(i)&&isP[i+1][j-1])isP[i][j]=true;
                    else isP[i][j]=false;
                }
            }
        }
        int[] rec=new int[len];
        for(int i=0;i<len;i++){
            rec[i]=i;
            for(int j=0;j<=i;j++){
                if(isP[j][i]){
                    int cut=-1;
                    if(j==0)cut=0;
                    else cut=rec[j-1]+1;
                    if(cut<rec[i])rec[i]=cut;
                }
            }
        }
        return rec[len-1];
    }
}