class Solution {
    boolean solution(String s) {
        long p = s.toLowerCase().chars().filter(c -> c == 'p').count();
        long y = s.toLowerCase().chars().filter(c -> c == 'y').count();

        return p == y;
    }
}