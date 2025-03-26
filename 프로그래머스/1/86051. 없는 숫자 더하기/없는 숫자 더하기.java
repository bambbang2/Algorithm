import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int[] all = {1,2,3,4,5,6,7,8,9};
        int allSum = Arrays.stream(all).sum();
        int answer = Arrays.stream(numbers).sum();
        
        return allSum - answer;
    }
}