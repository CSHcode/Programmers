class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};                    //찍는 반복 패턴
		int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = new int[3];                       //각각 몇점을 받았는지 저장할 배열
        
        for(int i=0; i<3; i++) {
				int count = 0;                          //정답을 카운트할 int
				int index = 0;                          //반복 패턴의 index
				for(int j=0; j<answers.length; j++) {
					if(i == 0) {                        //1번 학생
						if(answers[j] == one[index]) {  //answer의 j번째 정수와 one의 index번째 정수가 같으면
							count++;                    //count에 +1
						}
						index++;                        //그다음 문제로 넘어가기 위해 index에 +1
						if(index == 5) {                //index가 5에 다다르면
							index = 0;                  //1번 학생의 찍기 패턴 초기화
						}
					}else if(i == 1) {                  //2번 학생
						if(answers[j] == two[index]) {
							count++;
						}
						index++;
						if(index == 8) {
							index = 0;
						}
					}else if(i == 2) {                  //3번 학생
						if(answers[j] == three[index]) {
							count++;
						}
						index++;
						if(index == 10) {
							index = 0;
						}
					}
					score[i] = count;                   //score에 학생 점수 입력
				}
			}
        
        int max = Math.max(score[0], Math.max(score[1], score[2])); //가장 높은 점수 
        
        int count=0;                                    //최고점을 받은 학생이 몇명인지 count
		for(int i : score) {
			if(i == max) {
				count++;
			}
		}
        
        int[] answer = new int[count];
		int index = 0;
		for(int i=0; i<3; i++) {
			if(score[i] == max) {
				answer[index] = i+1;
				index++;
			}
		}
        
        return answer;
    }
}
