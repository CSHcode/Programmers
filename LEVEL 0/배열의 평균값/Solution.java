class Solution {
    public double solution(int[] numbers) {
      double answer = 0;
    	int tot=0;
    	for(int i=0; i<numbers.length; i++) {
    		tot+=numbers[i];
    	}
    	answer=(double) tot/numbers.length;
        return answer;
    }
}
