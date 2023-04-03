class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int count = 0;                              //읽을수 있는 숫자 중 맞춘 번호를 카운트
		for(int i=0; i<lottos.length; i++) {
			for(int j=0; j<win_nums.length; j++) {
				if(lottos[i] == win_nums[j]) {
					count++;
					break;
				}
			}
		}
        
        int zero = 0;                               //읽을수 없는 숫자를 카운트
		for(int i=0; i<lottos.length; i++) {
			if(lottos[i] == 0) {
				zero++;
			}
		}
        
        int max = count + zero;                     //최대 일치 번호
		int min = count;                            //최소 일치 번호
        
        if(max == 1 || max == 0) max = 1;           
		if(min == 1 || min == 0) min = 1;
        
        answer[0] = 7 - max;                        //일치 번호에 따른 순위 결정
        answer[1] = 7 - min;
        return answer;
    }
}
