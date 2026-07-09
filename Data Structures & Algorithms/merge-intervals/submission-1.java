class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        // [1,4],[0,4]
        // [0,4],[1,4]

        int[] current = intervals[0]; // [0,4]

        for (int i = 1; i < intervals.length; i++) {

            if (current[1] >= intervals[i][0]) { // [0,4<-- curren[1]] >= intervals[]
                current[1] = Math.max(current[1], intervals[i][1]); // 4 ,4
            } else {
                result.add(current);
                current = intervals[i];
            }
        }

        result.add(current);

        return result.toArray(new int[result.size()][]);
        
    }
}
