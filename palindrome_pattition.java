public class Solution {
    public ArrayList<ArrayList<String>> partition(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<String>> ans=new ArrayList<ArrayList<String>>();
        if(s.length()==0)return ans;
        int len=s.length();
        boolean[][] isP=new boolean[len][len];
        for(int i=len-1;i>=0;i--){
            for(int j=i;j<len;j++){
                if(i==j)isP[i][j]=true;
                else if(j==i+1){
                    if(s.charAt(i)==s.charAt(j))isP[i][j]=true;
                }
                else{
                    if(s.charAt(i)==s.charAt(j)&&isP[i+1][j-1])isP[i][j]=true;
                    else isP[i][j]=false;
                }
            }
        }
        ArrayList<String> init=new ArrayList<String>();
        partition(ans,init,isP,0,len,s);
        return ans;
        
    }
    public void partition(ArrayList<ArrayList<String>> ans, ArrayList<String> pass,boolean[][] isP,int begin,int len, String s){
        if(begin==len){
            ans.add(pass);
            return;
        }
        
        for(int i=begin;i<len;i++){
            if(isP[begin][i]){
                ArrayList<String> cp=new ArrayList<String>(pass);
                String news=s.substring(begin,i+1);
                cp.add(news);
                partition(ans, cp,isP,i+1,len,s);
            }
        }
    }
}