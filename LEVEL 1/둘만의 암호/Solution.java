import java.util.Arrays;
import java.util.List;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<String> skipList = Arrays.asList(skip.split(""));
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			for (int j = 0; j < index; j++) {
				temp += 1;
				if (temp > 122) temp -= 26;
				if(skipList.contains(String.valueOf(temp))) j--;
			}
			answer += String.valueOf(temp);
		}
        
        return answer;
    }
}
