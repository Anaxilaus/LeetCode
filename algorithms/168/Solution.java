import java.lang.Math;

class Solution {

    /**
     * Time complexity: O(log n)
     * Space complexity: O(1)
     */
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        double prevPeriod = 1;
        double currPeriod = 26;
        double character;
        while (0 < n) {
            character = Math.ceil((n % currPeriod) / prevPeriod);
            if (character == 0) character = 26;   // mod == 0, upper corner case
            result.append((char) ('A' - 1 + character));

            prevPeriod = currPeriod;
            n -= currPeriod;
            currPeriod *= 26;
        }
        return result.reverse().toString();
    }
}
