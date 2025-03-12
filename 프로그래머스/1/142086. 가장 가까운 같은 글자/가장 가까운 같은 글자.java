import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String s) {
        String[] sArr = s.split("");
        int[] answer = new int[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            List<Integer> indexList = new ArrayList<>();
            int index = s.indexOf(sArr[i]);

            while (index != -1) {
                if (index < i) indexList.add(index);
                index = s.indexOf(sArr[i], index + sArr[i].length());
            }
            if (indexList.isEmpty()) {
                answer[i] = -1;
            } else {
                answer[i] = i - indexList.get(indexList.size() - 1);
            }
        }
        return answer;
    }
}