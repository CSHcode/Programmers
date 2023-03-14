import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=1; i<food.length; i++) {                  //먼저 i번째 음식 수가 짝수인지 판별
			int temp = 0;                   
			if(food[i] == 1) {                              //음식을 1개만 갖고 있으면 0으로 넘어감
			} else if(food[i] %2 != 0) {                    //음식을 1개 초과 홀수개를 갖고있으면
				temp = food[i] - 1;                         //1개를 뺴줌
			} else {                                        //음식을 짝수개를 갖고있으면
				temp = food[i];                             //그대로 모두 사용
			}
			for(int j=0; j<temp/2; j++) {                   //음식수/2 만큼 arraylist에 추가해줌
				arr.add(i);
			}
		}
		
		ArrayList<Integer> half = (ArrayList<Integer>) arr.clone(); //똑같은 배열을 하나 복제
		
		arr.add(0);                                                 //물을 먼저 추가
		
		Collections.reverse(half);                                  //복제 했던 arraylist를 역순정렬
		
		arr.addAll(half);                                           //두 arraylist를 합침
		
		for(Integer i : arr) {
			answer += i.toString();
		}
        
        return answer;
    }
}
