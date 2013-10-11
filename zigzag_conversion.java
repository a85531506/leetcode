public class Solution {
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList[] recd=new ArrayList[nRows];
        if(nRows==1)return s;
        for(int i=0;i<nRows;i++)recd[i]=new ArrayList<Character>();
        int cursor=0;
        boolean direction=true;
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<s.length();i++){
            recd[cursor].add(s.charAt(i));
            if(direction){
                if(cursor!=nRows-1)cursor++;
                else{
                    cursor--;
                    direction=false;
                }
            }
            else{
                if(cursor!=0)cursor--;
                else{
                    cursor++;
                    direction=true;
                }
            }
            
        }
        for(int i=0;i<nRows;i++){
            for(int j=0;j<recd[i].size();j++){
                ans.append(recd[i].get(j));
            }
        }
        String res=ans.toString();
        return res;
    }
}