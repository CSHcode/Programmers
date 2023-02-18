import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr=new ArrayList<Integer>();    //약수를 담을 arraylist
        for(int i=1; i<=(int) Math.sqrt(n); i++) {          //n의 루트값까지만 for문을 돌림
			if(n%i==0) {                                    //만약 n을 i로 나누어 떨어지면
				arr.add(i);                                 //i를 arraylist에 추가
				if(n/i!=i) {                                //n/i 와 i 가 같은 정수가 아니면
					arr.add(n/i);                           //n/i 도 arraylist에 추가
				}
			}
		}
        Collections.sort(arr);                              //정렬
        int[] answer= new int[arr.size()];                  //리턴할 배열
        
        for(int i=0; i<arr.size(); i++) {
			answer[i]=arr.get(i);
		}
        
        return answer;
    }
}
