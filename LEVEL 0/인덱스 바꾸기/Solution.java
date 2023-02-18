class Solution {
    public String solution(String my_string, int num1, int num2) {
        num1=Math.min(num1, num2);                     //num1 과 num2 의 대소를 구분
		num2=Math.max(num1, num2);
        
        StringBuffer sb=new StringBuffer(my_string);   //StringBuffer를 사용
        sb.insert(num2, sb.charAt(num1));              //num2번째 자리에 num1번째 문자를 입력
		sb.insert(num1, sb.charAt(num2+1));            //그 후, num1번째 자리에 한칸 밀려난 num2+1번째 문자를 입력
		sb.deleteCharAt(num1+1);                       //원래 있었던 문자 삭제
		sb.deleteCharAt(num2+1);
        
        return sb.toString();
    }
}
