import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        ArrayList<Integer> al=new ArrayList<Integer>();        //arraylist를 하나 만듬
        for(int i:emergency) {                                 //매개변수로 들어온 int배열을 하나씩 arraylist에 넣음
				al.add(i);
			}
        Collections.sort(al, Collections.reverseOrder());      //arraylist를 내림차순으로 정렬
        for(int i=0; i<answer.length; i++) {       
				answer[i]=al.indexOf(emergency[i])+1; 
			}
        
        return answer;
    }
}
