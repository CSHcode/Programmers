class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
		String[] per = {"RT", "CF", "JM", "AN"};    //기준을 정하기 위해 성격순서쌍마다 왼쪽(음수)/오른쪽(양수)를 지정함   
        int[] tot = {0, 0, 0, 0};                   //각 성격순서쌍 초기값 0점
		
		for(int i=0; i<survey.length; i++) {
			if(survey[i].charAt(0) == 'R') {        //survey의 i번째 결과의 0번째 글자가 R 이면
				tot[0] += choices[i] - 4;           //성격순서쌍 RT 에서 choices의 i번째 점수-4 를 더함(최초 기준과 같으므로)
			}else if(survey[i].charAt(0) == 'T') {  //0번째 글자가 T 이면
				tot[0] -= choices[i] - 4;           //점수-4 를 뺌(최초 기준과 반대이므로)
			}else if(survey[i].charAt(0) == 'C') {  //이하 동일
				tot[1] += choices[i] - 4;
			}else if(survey[i].charAt(0) == 'F') {
				tot[1] -= choices[i] - 4;
			}else if(survey[i].charAt(0) == 'J') {
				tot[2] += choices[i] - 4;
			}else if(survey[i].charAt(0) == 'M') {
				tot[2] -= choices[i] - 4;
			}else if(survey[i].charAt(0) == 'A') {
				tot[3] += choices[i] - 4; 
			}else if(survey[i].charAt(0) == 'N') {
				tot[3] -= choices[i] -4;
			}
		}
		
		for(int i=0; i<tot.length; i++) {           //최종적으로 tot 에 저장된 점수를 판단
			if(tot[i] > 0) {
				answer += per[i].charAt(1);
			}else if(tot[i] < 0) {
				answer += per[i].charAt(0);
			}else {
				answer += (char) ( Math.min(per[i].charAt(0), per[i].charAt(1)));
			}
		}
        return answer;
    }
}
