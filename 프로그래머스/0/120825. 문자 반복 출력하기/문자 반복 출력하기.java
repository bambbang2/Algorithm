class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] stringArr = my_string.split("");
        
        for (String a : stringArr) {
            answer += a.repeat(n);
        }
        
        return answer;
    }
}