class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] words = s.split("");

        char[] charArr = new char[words.length];

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(" ")) {
                charArr[i] = (char) 32;
            } else if (words[i].charAt(0) >= 'a' && words[i].charAt(0) <= 'z' - n) {
                charArr[i] = (char) (words[i].charAt(0) + n);
            } else if (words[i].charAt(0) > 'z' - n && words[i].charAt(0) <= 'z') {
                charArr[i] = (char) (words[i].charAt(0) + n - 'z' + 'a' - 1);
            } else if (words[i].charAt(0) >= 'A' && words[i].charAt(0) <= 'Z' - n) {
                charArr[i] = (char) (words[i].charAt(0) + n);
            } else{
                charArr[i] = (char) (words[i].charAt(0) + n - 'Z' + 'A' - 1);
            }
            answer = String.valueOf(charArr);
        }
        return answer;
    }
}