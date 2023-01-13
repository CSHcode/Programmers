import java.util.ArrayList;
class Solution {
    public String solution(String my_string, int n) {
        ArrayList<Character> rep=new ArrayList<Character>();    //반복된 알파벳을 담을 arraylist
        for(int i=0; i<my_string.length(); i++) {               
        	for(int j=1; j<=n; j++) {                           //매개변수로 들어온n번 만큼 for문
        		rep.add(my_string.charAt(i));                   //arraylist에 my_string의 i번째 알파벳을 n번 넣음
        	}
        }
        	
        String answer="";
        for(char c : rep) {                                     //arraylist에 들어간 알파벳들을 하나하나 찾음
        	answer+=c;
        }
        
        return answer;
    }
}
