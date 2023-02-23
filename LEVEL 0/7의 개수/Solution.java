class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length; i++) {     //array의 길이만큼 for문을 돌림
			String s=String.valueOf(array[i]);  //array의 i번째 숫자를 String으로 가져옴
			for(int j=0; j<s.length(); j++) {   //s의 길이만큼 for문을 돌림
				if(s.charAt(j)=='7') {          //s의 j번째 문자가 7이면
					answer++;                   //answer에 1을 카운트
				}
			}
		}
        return answer;
    }
}
