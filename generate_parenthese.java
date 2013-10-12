public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<String> ans=new ArrayList<String>();
        if(n==0)return ans;
        generate(n,n,"",ans);
        return ans;
    }
    public void generate(int left, int right, String up, ArrayList<String> arr){
        if(right<left)return;
        else if(right==0&&left==0){
            arr.add(up);
            return;
        }
        else if(left==0){
            String newstring=up+")";
            generate(left,right-1,newstring, arr);
        }
        else{
            String newstring1=up+"(";
            String newstring2=up+")";
            generate(left-1,right,newstring1,arr);
            generate(left,right-1,newstring2,arr);
        }
    }
}