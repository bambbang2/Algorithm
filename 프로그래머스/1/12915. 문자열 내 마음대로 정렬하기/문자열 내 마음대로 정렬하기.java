import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Map<String, Character> map = new LinkedHashMap<>();

        for (String s : strings) {
            map.put(s, s.charAt(n));
        }

        List<Map.Entry<String, Character>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort((e1, e2) -> {
            int valueCompare = e1.getValue().compareTo(e2.getValue());
            if (valueCompare == 0) return e1.getKey().compareTo(e2.getKey());
            return valueCompare;
        });

        String[] answer = new String[strings.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = entryList.get(i).getKey();
        }
        
        return answer;
    }
}