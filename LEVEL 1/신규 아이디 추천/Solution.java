class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        answer = answer.toLowerCase();                      //영문자는 모두 소문자로 변경

		answer = answer.replaceAll("[^a-zA-Z0-9-_.]", "");  //영소문자,영대문자,-,_,. 가 아닌 문자는 모두 제거

		answer = answer.replaceAll("[.]{2,}", ".");         //. 가 2번 이상 연속으로 오면 . 으로 변경

		if (answer.charAt(0) == '.') {                      //첫번째 문자가 . 이면 제거
			answer = answer.substring(1);
		}
        
		if (answer.length() != 0) {                         //이 지점에서 길이가 0이 아니고
			if (answer.charAt(answer.length() - 1) == '.') {    //마지막 문자가 . 이면
				answer = answer.substring(0, answer.length() - 1);  //제거
			}
		}

		if (answer.length() == 0) {                         //이 지점에서 길이가 0이면
			answer += "a";                                  //a 추가
		}

		if (answer.length() >= 16) {                        //이 지점에서 길이가 16이상이면
			answer = answer.substring(0, 15);               //길이가 15가 되도록 자름
		}

		if (answer.charAt(answer.length() - 1) == '.') {        //15가 되도록 잘랐는데 마지막에 . 이 있으면
			answer = answer.substring(0, answer.length() - 1);  //제거
		}

		while (answer.length() <= 2) {                      //이 지점에서 길이가 2 이하이면 2를 넘어갈때까지
			answer += answer.charAt(answer.length() - 1);   //마지막 문자를 추가
		}
        return answer;
    }
}
