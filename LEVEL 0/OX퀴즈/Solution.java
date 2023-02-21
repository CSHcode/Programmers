class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++) {
			String[] split=quiz[i].split("\\s");        //quiz배열을 공백 기준으로 split
			if(split[1].equals("+")) {                  //split배열의 1번째 문자는 사칙연산 기호중 하나
				int ans= Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
				if(split[4].equals(String.valueOf(ans))) {  //split배열의 4번째 문자는 답이 써져있는 정수
					answer[i]="O";
				}else {
					answer[i]="X";
				}	
			} else {                                    //split배열의 1번째 문자가 '-'인 경우
				int ans= Integer.parseInt(split[0]) - Integer.parseInt(split[2]);
				if(split[4].equals(String.valueOf(ans))) {
					answer[i]="O";
				} else {
					answer[i]="X";
				}
			}
		}
        return answer;
    }
}
