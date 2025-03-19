import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        Arrays.stream(sizes).forEach(size -> {
            if (size[0] < size[1]) {
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
        });

        int x = Arrays.stream(sizes).mapToInt(size -> size[0]).max().orElse(1);
        int y = Arrays.stream(sizes).mapToInt(size -> size[1]).max().orElse(1);
        
        return x * y;
    }
}