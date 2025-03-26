class Solution {
    public boolean solution(int x) {
        int a = 0;
        String[] arr = String.valueOf(x).split("");
        for (String s : arr) {
            a += Integer.parseInt(s);
        }
        
        return x % a != 0 ? false : true;
    }
}