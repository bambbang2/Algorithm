import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> crown = new ArrayList<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            crown.add(score[i]);
            crown.sort(Collections.reverseOrder());
            answer[i] = crown.get(Math.min(crown.size(), k) - 1);
        }
        return answer;
    }
}