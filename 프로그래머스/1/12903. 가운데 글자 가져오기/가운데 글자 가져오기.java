class Solution {
    public String solution(String s) {
        int n = s.length() / 2;
        return s.substring(s.length() % 2 == 1 ? n : n-1, n + 1);
    }
}