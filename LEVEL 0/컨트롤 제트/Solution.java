import java.util.ArrayList;
import java.util.Arrays;
class Solution {
        public int solution(String s) {
    	ArrayList<String> arr = new ArrayList<>(Arrays.asList(s.split(" ")));
    	int answer=0;
    	while(arr.contains("Z")) {
    		arr.remove(arr.indexOf("Z")-1);
    		arr.remove(arr.indexOf("Z"));
    	}
    	for(int i=0; i<arr.size(); i++) {
    		answer+=Integer.parseInt(arr.get(i));
    	}
    	return answer;
        	
    }
}
