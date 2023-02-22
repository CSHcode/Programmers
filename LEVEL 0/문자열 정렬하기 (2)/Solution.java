import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String lower=my_string.toLowerCase();
        char[] arr=lower.toCharArray();
        Arrays.sort(arr);
        
        return new String(arr);
        
    }
}
