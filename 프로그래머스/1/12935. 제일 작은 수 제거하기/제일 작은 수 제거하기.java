import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = Arrays.stream(arr).filter(x -> x != Arrays.stream(arr).min().getAsInt()).toArray();
        
        return answer.length > 0 ? answer : new int[]{-1};
    }
}