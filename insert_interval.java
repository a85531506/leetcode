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
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Interval> ans=new ArrayList<Interval>();
        intervals.add(newInterval);
        Collections.sort(intervals, new intComp());
        int begin=intervals.get(0).start;
        int end=intervals.get(0).end;
        for(int i=0;i<intervals.size();i++){
            if(end>=intervals.get(i).start){
                end=Math.max(end, intervals.get(i).end);
            }
            else{
                Interval nint=new Interval(begin, end);
                ans.add(nint);
                begin=intervals.get(i).start;
                end=intervals.get(i).end;
            }
        }
        Interval nint=new Interval(begin, end);
        ans.add(nint);
        return ans;
    }
}
class intComp implements Comparator<Interval>{
    public int compare(Interval a,Interval b){
        return a.start-b.start;
    }
}