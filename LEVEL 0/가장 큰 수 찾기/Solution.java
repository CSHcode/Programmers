class Solution {
    public int[] solution(int[] array) {
        int[] answer=new int[2];
        
        int max=array[0];                       //array의 첫번째 정수를 임의로 max로 잡음
        int index=0;
        for(int i=1; i<array.length; i++) {     //배열의 길이만큼 for문을 돌림
				if(array[i]>max) {              //array의 i번째 숫자가 max보다 크면
					max=array[i];               //max에 저장
					index=i;                    //i 를 저장
				}
			}
        
        answer[0]=max;
        answer[1]=index;
        
        return answer;
    }
}
