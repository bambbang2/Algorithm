class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] stringArr = my_string.split("");
        
        for (String a : stringArr) {
            for (int i = 0; i < n; i++) {
                answer +=  a;
            }
        }
        
        return answer;
    }
}