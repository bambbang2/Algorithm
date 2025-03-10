class Solution {
    public boolean solution(String s) {
        String numReg = "^[\\d]*$";
        if ((s.length() == 4 || s.length() == 6) && s.matches(numReg)) {
            return true;
        }
        
        return false;
    }
}