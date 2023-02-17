class Solution {
    public String solution(String my_string) {
        String answer="";
        for(int i=0; i<my_string.length(); i++) {
				if(Character.isUpperCase(my_string.charAt(i))) {                //i번째 문자가 대문자면 
					answer+=String.valueOf(my_string.charAt(i)).toLowerCase();  //소문자로 바꿔서 더함
				}else {                                                         //i번째 문자가 소문자면
					answer+=String.valueOf(my_string.charAt(i)).toUpperCase();  //대문자로 바꿔서 더함
				}
			}
        return answer;
    }
}
