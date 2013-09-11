public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int hlength=haystack.length();
        int nlength=needle.length();
        if(hlength<nlength)return null;
        if(hlength==0||nlength==0)return haystack;
        int find=-1;
        for(int i=0;i<=hlength-nlength;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(equ(haystack,needle,i)){
                find=i;
                break;
                }
            }
        }
        if(find>=0){
            String ans=haystack.substring(find);
            return ans;
        }
        else return null;
    }
    public boolean equ(String haystack, String needle, int begin){
        int length=needle.length();
        for(int i=0;i<length;i++){
            if(haystack.charAt(begin+i)!=needle.charAt(i))return false;
        }
        return true;
    }
}