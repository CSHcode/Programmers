import java.util.Arrays;
import java.util.HashSet;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();      //중복 제거용 set
		
		for(int i=0; i<numbers.length-1; i++) {             //numbers배열에 있는 원소로 만들수 있는
			for(int j=i+1; j<numbers.length; j++) {         //모든 합을 set에 저장
				set.add(numbers[i] + numbers[j]);
			}
		}
		
		Integer[] answerInt = set.toArray(new Integer[0]);  //set를 Integer배열로 변환
		int[] answer = Arrays.stream(answerInt).mapToInt(Integer::intValue).toArray(); //int배열로 변환
        Arrays.sort(answer);                                //정렬
		
		return answer;
	}
}
