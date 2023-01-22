import java.util.regex.Pattern;
class Solution {
    public int solution(String my_string) {
         int answer = 0;
        for(int i=0; i<my_string.length(); i++) {
        	if(Pattern.matches("^[0-9]*", my_string.substring(i, i+1))) {
        		answer+=Integer.parseInt(my_string.substring(i, i+1));
        	}
        }
        return answer;
    }
}
