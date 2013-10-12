public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<String, ArrayList<String>> rec=new HashMap<String,ArrayList<String>>();
        ArrayList<String> ans=new ArrayList<String>();
        if(strs.length==0)return ans;
        for(int i=0;i<strs.length;i++){
            char[] key=strs[i].toCharArray();
            Arrays.sort(key);
            String newkey=new String(key);
            if(rec.containsKey(newkey)){
                rec.get(newkey).add(strs[i]);
            }
            else{
                ArrayList<String> ad=new ArrayList<String>();
                ad.add(strs[i]);
                rec.put(newkey,ad);
            }
        }
        for(ArrayList<String> value:rec.values()){
            if(value.size()>1)ans.addAll(value);
        }
        return ans;
    }
}