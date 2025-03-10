class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.toLowerCase().split("\\s", -1);
        for (String word : words) {
            for (char j = 0; j < word.length(); j++) {
                if (j % 2 == 0) {
                    answer.append(Character.toUpperCase(word.charAt(j)));
                } else {
                    answer.append(Character.toLowerCase(word.charAt(j)));
                }
            }
            answer.append(" ");
        }
        
        answer.setLength(s.length());
        return answer.toString();
    }
}