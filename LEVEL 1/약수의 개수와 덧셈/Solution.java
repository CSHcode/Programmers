class Solution {
    public int solution(int left, int right) {
        int answer = 0;
		for(int i=left; i<=right; i++) {        //left 부터 right 까지 for문
			int count = 0;                      //i의 약수의 개수를 저장할 count
			for(int j=1; j<=i; j++) {           
				if(i%j == 0) {                  //j가 i의 약수이면
					count++;                    //count +1
				}
			}
			if(count%2 == 0) {                  //count가 짝수이면 
				answer += i;
			}else {                             //count가 홀수이면
				answer -= i;
			}
		}
        return answer;
    }
}
