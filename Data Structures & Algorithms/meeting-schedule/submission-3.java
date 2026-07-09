/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        boolean result = true;
        int previousLast = 0;

        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        for(int i=0;i < intervals.size(); i++){
            Interval each = intervals.get(i);
            //if(each.start > 0 && each.end > 0){
                int one = each.start;
                System.out.println(previousLast);
                if(previousLast > one ){
                    return false;
                }
                int two = each.end;
                previousLast = two;
            //}
        }

        return result;
    }
}
