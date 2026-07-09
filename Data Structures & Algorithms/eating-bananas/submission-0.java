class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long hours = calculateHours(piles, mid);

            if (hours <= h) {
                answer = mid;
                right = mid - 1; // try smaller speed
            } else {
                left = mid + 1;  // need faster speed
            }
        }

        return answer;
    }

    private long calculateHours(int[] piles, int speed) {
        long hours = 0;

        for (int pile : piles) {
            hours += (pile + speed - 1) / speed; // ceil(pile/speed)
        }

        return hours;
    }
}
