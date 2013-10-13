public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String[] pad=new String[10];
        pad[0]="";
        pad[1]="";
        pad[2]="abc";
        pad[3]="def";
        pad[4]="ghi";
        pad[5]="jkl";
        pad[6]="mno";
        pad[7]="pqrs";
        pad[8]="tuv";
        pad[9]="wxyz";
        ArrayList<String> ans=new ArrayList<String>();
        letter(digits,0,pad,"",ans);
        return ans;
    }
    public void letter(String digit,int index, String[] pad, String pre,ArrayList<String> ans){
        if(index==digit.length()){
            ans.add(pre);
            return;
        }
        else{
            int num=digit.charAt(index)-'0';
            String letter=pad[num];
            for(int i=0;i<letter.length();i++){
                String newstring=pre+letter.charAt(i);
                letter(digit,index+1,pad,newstring,ans);
            }
        }
    }
}