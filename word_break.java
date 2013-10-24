public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int len=s.length();
        boolean[] rec=new boolean[len];
        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                String temp=s.substring(j,i+1);
                if(dict.contains(temp)){
                    if(j==0){
                        rec[i]=true;
                        break;
                    }
                    else rec[i]=rec[i]||rec[j-1];
                }
            }
        }
        return rec[len-1];
    }
}