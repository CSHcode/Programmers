class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String three = Integer.toString(n, 3);          //n을 3진법으로 변환
        
        StringBuffer sb = new StringBuffer(three);      //reverse를 쓰기위해 stringbuffer사용
		String rev = sb.reverse().toString();
        
        answer = Integer.parseInt(rev, 3);              //three를 10진법으로 변환
        
        return answer;
    }
}
