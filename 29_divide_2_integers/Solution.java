class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean isNeg = (dividend < 0) ^ (divisor < 0);
        long dividendL = Math.abs((long)dividend);
        long divisorL = Math.abs((long)divisor);
        int count = 0;
        while (dividendL >= divisorL) {
            int shift = 0;
            while (dividendL >= (divisorL << shift)) shift++;
            dividendL -= (divisorL << (shift - 1));
            count += (1 << (shift - 1));
        }
        return isNeg ? -count : count;
    }
}