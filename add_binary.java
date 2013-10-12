public class Solution {
    public String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int alen=a.length();
        int blen=b.length();
        ArrayList<Character> res=new ArrayList<Character>();
        int aend=alen-1;
        int bend=blen-1;
        int car=0;
        while(aend>=0||bend>=0){
            int adigit=0;
            int bdigit=0;
            if(aend>=0){
                adigit=a.charAt(aend)-'0';
                aend--;
            }
            if(bend>=0){
                bdigit=b.charAt(bend)-'0';
                bend--;
            }
            int sum=adigit+bdigit+car;
            char dig=(char)(sum%2+'0');
            res.add(0,dig);
            car=sum/2;
        }
        if(car>0)res.add(0,'1');
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<res.size();i++){
            ans.append(res.get(i));
        }
        String ans2=ans.toString();
        return ans2;
    }
}