class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;                             //1의 약수의 개수 1개
        for(int i=2; i<=number; i++) {              //2부터 number 까지
			int count = 2;                          //2부터는 무조건 약수의 개수가 2 이상이므로
			for(int j=2; j<=Math.sqrt(i); j++) {    //약수의 개수 구하는 for문
				if(i % j == 0) {
					if(j == Math.sqrt(i)) {
						count++;
					}else {
						count += 2;
					}
				}
			}
			if (count > limit) {                    
				answer += power;
			} else {
				answer += count;
			}
		}
        return answer;
    }
}
