class Solution {
    public long solution(long n) {
        double a = Math.sqrt(n);
        long x = (long)a;
        return a == x ? (x + 1) * (x + 1) : -1;
    }
}