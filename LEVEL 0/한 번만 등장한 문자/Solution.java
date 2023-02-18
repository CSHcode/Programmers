import java.util.*;
class Solution {
    public String solution(String s) {
        String answer="";
        List<String> list=Arrays.asList(s.split(""));       //s를 한 문자씩 나누어 list에 저장
        HashSet<String> set=new HashSet<String>();          //중복을 피하기 위해 hashset 생성
        
        for(int i=0; i<s.length(); i++) {                                          //list에
				if(Collections.frequency(list, String.valueOf(s.charAt(i)))==1) {  //s의 i번째 문자가 1번만 있으면 
					set.add(String.valueOf(s.charAt(i)));   //그 문자를 set에 저장    
				}
			}
        
        ArrayList<String> arr=new ArrayList<String>(set);   //set를 arraylist로 변경
		Collections.sort(arr);                              //정렬
        
        Iterator it=arr.iterator();
			while(it.hasNext()) {
				answer+=it.next();                          //string으로 변환
			}
        return answer;
    }
}
