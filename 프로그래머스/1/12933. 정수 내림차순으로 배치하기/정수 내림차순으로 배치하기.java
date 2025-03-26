import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        String answer = "";
        
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Comparator.reverseOrder());
        for (String s : str) {
            answer += s;
        }

        return Long.parseLong(answer);
    }
}