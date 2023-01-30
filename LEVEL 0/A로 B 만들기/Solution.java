import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer=-1;
        char[] bef=before.toCharArray();    //before 를 담은 char배열
        char[] aft=after.toCharArray();     //after 를 담은 char배열
        
        Arrays.sort(bef);                   //정렬
		Arrays.sort(aft);                   //정렬
        
        if(Arrays.equals(bef, aft)) {       //만약 bef 와 aft가 같으면
				answer=1;                   //1을 리턴
			} else {                        //다르면
				answer=0;                   //0을 리턴
			}
        return answer;
    }
}
