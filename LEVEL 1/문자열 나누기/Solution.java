import java.util.ArrayList;
class Solution {
    public int solution(String s) {
        ArrayList<String> arr = new ArrayList<String>();
        String ss = s;                      
		char temp = s.charAt(0);
		int count = 1;
		int idx = 1;
		for (int i = 1; i < s.length(); i++) {
			if (count == 0) {
				String add = ss.substring(0, idx);
				arr.add(add);
				ss = ss.substring(idx);
				temp = ss.charAt(0);
				idx = 1;
				count = 1;
			} else if (count != 0) {
				if (ss.charAt(idx) == temp) {
					count++;
					idx++;
				}else {
					count--;
					idx++;
				}
			}

		}
		arr.add(ss);
        return arr.size();
    }
}
