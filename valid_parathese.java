public class Solution {
    public boolean isValid(String s) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(s.length()==0)return true;
        Stack st=new Stack();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{')st.push(c);
            if(c==')'){
                if(st.empty()||(Character)st.pop()!='(')return false;
            }
            if(c==']'){
                if(st.empty()||(Character)st.pop()!='[')return false;
            }
            if(c=='}'){
                if(st.empty()||(Character)st.pop()!='{')return false;
            }
        }
        if(!st.empty())return false;
        return true;
    }
}