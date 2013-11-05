public class Solution {
    public ArrayList<String> wordBreak(String s, Set<String> dict) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<String> res=new ArrayList<String>();
        int len=s.length();
        if(len==0)return res;
        ArrayList[] cache=new ArrayList[len];
        for(int i=len-1;i>=0;i--){
            cache[i]=new ArrayList<String>();
            for(int j=i;j<len;j++){
                String sub=s.substring(i,j+1);
                if(dict.contains(sub)){
                    if(j==len-1){
                        cache[i].add(sub);
                    }
                    else{
                        ArrayList<String> temp=cache[j+1];
                        for(int k=0;k<temp.size();k++){
                            String get=temp.get(k);
                            get=sub+" "+get;
                            cache[i].add(get);
                        }
                    }
                }
            }
        }
        return cache[0];
    }
}