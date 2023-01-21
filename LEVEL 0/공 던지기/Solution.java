class Solution {
      public int solution(int[] numbers, int k) {
	        int answer = 1;
	       
	        for(int i=1; i<k; i++) {
	            answer+=2;
	            if(answer>numbers.length) {
	                answer-=numbers.length;
	            }
	        }
	        return answer;
	}
}
