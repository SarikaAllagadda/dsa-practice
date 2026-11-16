class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        if (exp < 0) {
            exp = -exp; // Only negate the exponent here; leave x alone!
        }
        
        double ans = 1.0;
        while (exp != 0) {
            if ((exp & 1) == 1) {
                ans *= x;
            }
            x *= x;
            exp >>= 1;
        }
        
        // Apply the negative exponent at the very end
        return n < 0 ? 1.0 / ans : ans;
    }
}
