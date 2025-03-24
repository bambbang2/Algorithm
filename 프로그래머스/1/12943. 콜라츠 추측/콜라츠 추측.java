class Solution {
    public int solution(long num) {
        int answer = 0;
        if (num == 1L) return 0;

        while (num > 1 && answer < 500) {
            answer++;
            if (num % 2 == 0L) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
        }
        
        return answer == 500 ? -1 : answer;
    }
}