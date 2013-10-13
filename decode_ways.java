public class Solution {
    public int numDecodings(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length()==0||s.charAt(0)=='0')return 0;
        if(s.length()==1)return 1;
        int len=s.length();
        int[] rec= new int[len];
        rec[0]=1;
        if(atoi(s,0,1)<=26&&s.charAt(1)!='0')rec[1]=2;
        else if(s.charAt(1)=='0'&&s.charAt(0)>'2')return 0;
        else rec[1]=1;
        for(int i=2;i<s.length();i++){
            if(s.charAt(i-1)=='0'){
                if(s.charAt(i)=='0')return 0;
                else rec[i]=rec[i-2];
            }
            else{
                if(s.charAt(i)=='0'){
                    if(s.charAt(i-1)>'2')return 0;
                    else rec[i]=rec[i-2];
                }
                else {
                    if(atoi(s,i-1,i)<=26)rec[i]=rec[i-1]+rec[i-2];
                    else rec[i]=rec[i-1];
                }
            }
        }
        return rec[len-1];
    }
    public int atoi(String s,int begin,int end){
        int first=s.charAt(begin)-'0';
        int second=s.charAt(end)-'0';
        return first*10+second;
    }
}