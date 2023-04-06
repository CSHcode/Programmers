class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;                         //값을 계속 더해갈 answer
        for(int i=0; i<signs.length; i++) {     //배열의 길이만큼 for문 돌림
			if(signs[i] == true) {              //양수이면
				answer += absolutes[i];         //answer 에 그냥 더함
			}else {                             //음수이면
				String num = "-" + Integer.toString(absolutes[i]);  //String으로 변환하여 앞에 - 을 붙이고
				answer += Integer.parseInt(num);    //다시 int 로 변환하여 answer에 더함
			}
		}
        return answer;
    }
}
