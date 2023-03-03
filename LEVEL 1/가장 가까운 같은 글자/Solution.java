class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
		answer[0] = -1;                                         //첫번째 글자는 항상 -1
		StringBuilder sb = new StringBuilder(s);
		
		for(int i=1; i<s.length(); i++) {
			String temp = sb.substring(0, i);                   //i 번째 까지 s 를 자름
			if(temp.lastIndexOf(s.charAt(i)) != -1) {           //자른 문자열에 i번째 글자가 존재하면
				answer[i] = i - temp.lastIndexOf(s.charAt(i));  //index 차 를 넣음
			}else {
				answer[i] = -1;
			}
		}
        return answer;
    }
}
