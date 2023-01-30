class Solution {
    public int solution(int i, int j, int k) {
        int answer=0;
			for(int a=i; a<=j; a++) {                       //i에서 j까지
				String s=String.valueOf(a);                 //int a를 String s로 변환
				char[] ch=s.toCharArray();                  //s에 있는 숫자 하나하나를 배열에 저장
				for(int b=0; b<ch.length; b++) {            
					if(ch[b]==Character.forDigit(k, 10)) {  //k와 ch배열의 b번째 와 같으면
						answer++;                           //answer에 1을 더함
					}
				}
			}
        return answer;
    }
}
