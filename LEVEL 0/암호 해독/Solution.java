class Solution {
    public String solution(String cipher, int code) {
        int code1=code;
        String answer="";
        
        while(code<=cipher.length()){
            answer+=cipher.charAt(code-1);
				code+=code1;
			}
        return answer;
        
    }
}
