import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i : numlist) {
			if(i%n==0) {        //i가 n으로 나누어 떨어지면
                arr.add(i);     //arr에 추가
			}
		}
        
        Integer[] answer1=arr.toArray(new Integer[arr.size()]);     //arr를 Integer배열로 변환
		int[] answer=Arrays.stream(answer1).mapToInt(Integer::intValue).toArray(); 
                
        return answer;
    }
}
