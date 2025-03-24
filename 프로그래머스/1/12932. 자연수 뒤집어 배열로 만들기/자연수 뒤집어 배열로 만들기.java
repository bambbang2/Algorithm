import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(long n) {
        String[] array = ("" + n).split("");
        int[] answer = new int[array.length];

        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            answer[index] = Integer.parseInt(array[i]);
            index++;
        }
        
        return answer;
    }
}