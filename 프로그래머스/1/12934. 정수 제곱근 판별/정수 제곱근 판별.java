class Solution {
    public long solution(long n) {
        double a = Math.sqrt(n);
        long x = (long) a;
        return a == x ? (long)Math.pow(x + 1, 2) : -1;
    }
}