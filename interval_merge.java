/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Interval> ans =new ArrayList<Interval>();
        if(intervals.size()==0)return ans;
        Collections.sort(intervals, new intComp());
        int begin=intervals.get(0).start;
        int end=intervals.get(0).end;
        for(int i=1;i<intervals.size();i++){
            if(intervals.get(i).start<=end){
                end=Math.max(end, intervals.get(i).end);
            }
            else{
                Interval find=new Interval(begin, end);
                ans.add(find);
                begin=intervals.get(i).start;
                end=intervals.get(i).end;
            }
        }
        Interval find=new Interval(begin,end);
        ans.add(find);
        return ans;
    }
}
class intComp implements Comparator<Interval>{
    public int compare(Interval a, Interval b){
        return a.start-b.start;
    }
}