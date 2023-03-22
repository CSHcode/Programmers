class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++) {
			String temp = babbling[i]           //배열의 i번째 단어를 가져와서 
					.replace("aya", "1")        //aya 는 1로
					.replace("ye", "2")         //ye 는 2로
					.replace("woo", "3")        //woo 는 3으로
					.replace("ma", "4");        //ma는 4로 바꿈
			if(temp.matches(".*[a-z].*")) {     //만약 숫자로 바뀌지 않고 남겨진 알파벳이 있으면
				continue;                       //다음 단어로 넘어감
			}else if(temp.contains("11")||temp.contains("22")||temp.contains("33")||temp.contains("44")){
				continue;
            }else {
            	answer++;
            }
		}
        return answer;
    }
}
