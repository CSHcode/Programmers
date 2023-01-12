class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];     //리턴값용 정수배열
		for(int i=0; i<numbers.length; i++) {       //매개변수로 받은 배열의 크기만큼 for문
			answer[i]=numbers[i]*2;                 //i번째 숫자에 2를 곱하여 리턴용배열의 i번째에 입력
		}
        return answer;
    }
}
