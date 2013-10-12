public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(strs.length==0)return "";
        StringBuffer res=new StringBuffer(strs[0]);
        
        int len=res.length();
        for(int i=1;i<strs.length;i++){
            for(int j=0;j<len;j++){
                if(j==strs[i].length()||res.charAt(j)!=strs[i].charAt(j)){
                    len=j;
                    break;
                }
            }
        }
        String ans=res.substring(0,len);
        return ans;
    }
}