class Solution {
    public int[] solution(int[] numbers, String direction) {
		 int[] answer = new int[numbers.length];
		 switch(direction) {
		 case "left" : 
			 int temp=numbers[0];
			 for(int i=0; i<numbers.length-1; i++) {
				 answer[i]=numbers[i+1];
			 }
			 answer[numbers.length-1]=temp; break;
		 
		 case "right" :
			 int temp1=numbers[numbers.length-1];
			 for(int i=numbers.length-1; i>0; i--) {
				 answer[i]=numbers[i-1];
			 }
			 answer[0]=temp1; break;
		 }
 
	        return answer;	
	}
}
